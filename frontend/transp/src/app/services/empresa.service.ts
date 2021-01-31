import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { EmpresaModel } from '../models/empresa.model';



@Injectable({
  providedIn: 'root'
})
export class EmpresaService {
  private url = 'http://localhost:8091/api/empresa/';

  private httpHeaders =new HttpHeaders({'Content-Type': 'application/json'})


  constructor(private http: HttpClient) {  }

  public repLegal = [];

  setEmpresa(empresa: EmpresaModel) {   

    return this.http.post(`${this.url}`, empresa, {headers:this.httpHeaders});
  }



}
