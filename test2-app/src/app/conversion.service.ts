import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ConversionService {
  private baseUrl = 'http://localhost:8080/api/conversion'; // Thay đổi URL tùy theo API của bạn

  constructor(private http: HttpClient) {}

  convertStringToHex(input: string): Observable<string> {
    return this.http.post<string>(`${this.baseUrl}/string-to-hex`, input);
  }

  convertHexToString(input: string): Observable<string> {
    return this.http.post<string>(`${this.baseUrl}/hex-to-string`, input);
  }

  // Tương tự cho các phương thức chuyển đổi khác
}
