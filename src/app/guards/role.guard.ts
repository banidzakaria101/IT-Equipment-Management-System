import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { AuthService } from '../services/auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private authService: AuthService, private router: Router) {}

  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): boolean {
    const expectedRole = route.data['expectedRole'];

    if (!this.authService.isLoggedIn()) {
      this.router.navigate(['/login']);
      return false;
    }

    const userRole = this.authService.getUserRole();

    if (userRole !== expectedRole) {
      this.redirectUser(userRole);
      return false;
    }

    return true;
  }

  private redirectUser(role: string | null): void {
    if (role === 'ADMIN') {
      this.router.navigate(['/admin-board']);
    } else if (role === 'TECHNICIAN') {
      this.router.navigate(['/technician-dashboard']);
    } else if (role === 'EMPLOYEE') {
      this.router.navigate(['/employee-board']);
    }
  }
}
