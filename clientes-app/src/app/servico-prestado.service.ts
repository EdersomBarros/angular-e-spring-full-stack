import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ServicoPrestado } from './servico-prestado/servicoPrestado';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class ServicoPrestadoService {

  apiURL: string = environment.apiURLBase + '/api/servicos-prestados';

  constructor(private http:HttpClient) {   }
   salvar(servicoPrestado: ServicoPrestado) : Observable<ServicoPrestado>{

      return this.http.post<ServicoPrestado>(this.apiURL, servicoPrestado);
   }



}
