import { Component, OnInit } from '@angular/core';
import { Weapon } from './class/weapon';
import { HttpClient } from 'selenium-webdriver/http';
import { WeaponService } from './weapon.service';
import { Sword } from './class/sword';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'Craftdwarf';

  private service: WeaponService;
  public lastItems: Weapon[] = [];

  constructor(param_service: WeaponService) {
    this.service = param_service;
  }

  public randomizeNumberOfClick() {
    let randomNumber = Math.random();
    if (randomNumber < 0.15) {
      this.service.getRandomWeapon().subscribe(
        (param) => {
          this.lastItems.push(param);
        }
      )
    }
  }
}
