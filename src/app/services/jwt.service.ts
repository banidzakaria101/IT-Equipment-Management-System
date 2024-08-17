import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class JwtService {

  decodeToken(token: string): any {
    return jwtDecode(token);
  }

  getUserRole(token: string) {
    const decodedToken = this.decodeToken(token);
    return decodedToken?.role ;
  }

  getUsernameFromToken(token: string) {
    const decodedToken = this.decodeToken(token);
    return decodedToken?.sub || null;
  }
}
function jwtDecode(token: string): any {
  throw new Error('Function not implemented.');
}

