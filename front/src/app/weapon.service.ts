import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from "rxjs/operators";
import { Sword } from './class/sword';
import { Axe } from './class/axe';
import { Spear } from './class/spear';
import { Dagger } from './class/dagger';
import { Weapon } from './class/weapon';

@Injectable({
  providedIn: 'root'
})
export class WeaponService {

  private baseUrl = "http://localhost:8080/api";
  private httpService: HttpClient;

  constructor(param_http_service: HttpClient) {
    this.httpService = param_http_service;
  }

  // Random weapon 

  public getRandomWeapon():Observable<Weapon>{
    return this.httpService.get(`${this.baseUrl}/weapons/create`).pipe(
      map(
        (param_response) => {
          let obj: any = param_response as Weapon;
          return obj;
        }
      )
    )
  }

  // Swords functions
  public getSwordList():Observable<Sword[]> {
    return this.httpService.get(`${this.baseUrl}/weapons/swords`).pipe(
      map(
        (param_my_response) => {
          let obj:any = param_my_response as Sword;
          return obj;
        }
      )
    )
  }

  // Axes functions
  public getAxeList():Observable<Axe[]> {
    return this.httpService.get(`${this.baseUrl}/weapons/axes`).pipe(
      map(
        (param_my_response) => {
          let obj:any = param_my_response as Axe;
          return obj;
        }
      )
    )
  }

  // Spears functions
  public getSpearList():Observable<Spear[]> {
    return this.httpService.get(`${this.baseUrl}/weapons/spears`).pipe(
      map(
        (param_my_response) => {
          let obj:any = param_my_response as Spear;
          return obj;
        }
      )
    )
  }

  // Daggers functions
  public getDaggerList():Observable<Dagger[]> {
    return this.httpService.get(`${this.baseUrl}/weapons/daggers`).pipe(
      map(
        (param_my_response) => {
          let obj:any = param_my_response as Dagger;
          return obj;
        }
      )
    )
  }

  
  
}
