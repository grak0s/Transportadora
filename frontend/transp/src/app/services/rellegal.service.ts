import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class RellegalService {

  private url = 'http://localhost:8091/api/replegal/';

  private httpHeaders =new HttpHeaders({'Content-Type': 'application/json'})

  constructor(private http: HttpClient) { }
}
