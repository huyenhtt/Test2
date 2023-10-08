import { Component } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css'],
})
export class MainComponent {
  sourceFormat: string = 'string';
  targetFormat: string = 'hex';
  inputData: string = '';
  conversionResult: string;
  constructor(private http: HttpClient) {
    this.conversionResult = '';
  }

  convertData() {
    const url =
      'http://localhost:8080/api/conversion/' +
      this.sourceFormat +
      '-to-' +
      this.targetFormat;
    const requestBody = { input: this.inputData };

    this.http.post(url, requestBody).subscribe(
      (response: any) => {
        this.conversionResult = response.result;
      },
      (error) => {
        console.error('Error:', error);
      }
    );
  }
}
