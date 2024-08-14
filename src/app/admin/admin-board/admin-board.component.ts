import { Component } from '@angular/core';

@Component({
  selector: 'app-admin-board',
  templateUrl: './admin-board.component.html',
  styleUrls: ['./admin-board.component.css']
})
export class AdminBoardComponent {
  currentPage: string = 'employee'; // Default page

  showPage(page: string) {
    this.currentPage = page;
  }
}
