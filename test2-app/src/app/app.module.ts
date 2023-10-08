// import { NgModule } from '@angular/core';
// import { BrowserModule } from '@angular/platform-browser';
// import { HttpClientModule } from '@angular/common/http';

// import { AppRoutingModule } from './app-routing.module';
// import { AppComponent } from './app.component';
// import { FormsModule } from '@angular/forms';
// import { MainComponent } from './main/main.component';
// import { ResultComponent } from './result/result.component';

// @NgModule({
//   declarations: [MainComponent ,AppComponent,ResultComponent],
//   imports: [BrowserModule, AppRoutingModule, FormsModule,HttpClientModule],
//   providers: [],
//   bootstrap: [AppComponent],
// })
// export class AppModule {}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // Import FormsModule nếu bạn sử dụng ngModel
import { HttpClientModule } from '@angular/common/http'; // Import HttpClientModule nếu bạn giao tiếp với API
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component'; // Import AppComponent
import { MainComponent } from './main/main.component'; // Import MainComponent
import { ResultComponent } from './result/result.component'; // Import ResultComponent

@NgModule({
  declarations: [AppComponent, MainComponent, ResultComponent], // Khai báo các component trong ứng dụng
  imports: [BrowserModule, FormsModule, HttpClientModule,AppRoutingModule], // Import các module cần thiết
  providers: [], // Các dịch vụ (services) được cung cấp ở đây (nếu có)
  bootstrap: [AppComponent], // Khởi đầu ứng dụng bằng AppComponent
})
export class AppModule {}
