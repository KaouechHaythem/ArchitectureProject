import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root' 
})
export class ApplicationService {

  private baseUrl = 'http://localhost:8080/api/apps';

  constructor(private http: HttpClient) { }

 
  saveApplication(formData:FormData): Observable<any> {
    
    return this.http.post(`${this.baseUrl}`, formData);
  }

}