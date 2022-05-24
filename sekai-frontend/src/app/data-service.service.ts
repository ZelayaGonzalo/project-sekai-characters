import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { apiURL } from './Variables';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {

constructor(private http:HttpClient) { }

  getUnit(id:Number):Observable<any>{
    let url:string = `http://${apiURL}:8080/getUnit?id=${id}`
    return this.http.get(url);
  }

  getMember(id:Number):Observable<any>{
    let url:string = `http://${apiURL}:8080/getMember?id=${id}`
    return this.http.get(url);
  }

}
