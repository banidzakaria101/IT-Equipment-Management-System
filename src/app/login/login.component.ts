import { Component, OnInit } from '@angular/core';
import { AuthService } from '../services/auth.service';
import { StorageService } from '../services/storage.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  form: any = {
    username: null,
    password: null
  };
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';
  roles: string[] = [];

  constructor(
    private authService: AuthService,
    private storageService: StorageService,
    private router: Router
  ) { }

  ngOnInit(): void {
    if (this.storageService.isLoggedIn()) {
      this.isLoggedIn = true;
      this.roles = this.storageService.getUser().roles;
      this.redirectUser();
    }
  }

  onSubmit(form: NgForm): void {
    const { username, password } = form.value;

    this.authService.login(username, password).subscribe({
      next: data => {
        this.storageService.saveUser(data);

        this.isLoginFailed = false;
        this.isLoggedIn = true;
        this.roles = this.storageService.getUser().roles;
        this.redirectUser();
      },
      error: err => {
        if (err.status === 403) {
          this.errorMessage = 'Incorrect username or password.';
        } else if (err.error && err.error.message) {
          this.errorMessage = err.error.message;
        } else {
          this.errorMessage = 'An unknown error occurred!';
        }
        this.isLoginFailed = true;
      }
    });
  }

  redirectUser(): void {
    const role = this.storageService.getUser().roles[0];
    if (role === 'ADMIN') {
      this.router.navigate(['/admin-board']);
    } else if (role === 'TECHNICIAN') {
      this.router.navigate(['/technician-dashboard']);
    } else if (role === 'EMPLOYEE') {
      this.router.navigate(['/employee-board']);
    }
  }
}
