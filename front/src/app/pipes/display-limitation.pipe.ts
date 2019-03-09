import { Pipe, PipeTransform } from '@angular/core';
import { Weapon } from '../class/weapon';

@Pipe({
  name: 'displayLimitation'
})
export class DisplayLimitationPipe implements PipeTransform {

  transform(value: Weapon[], param_max: number): Weapon[] {
    let limitedArray = [];
    for (let i = 0; i < param_max; i++) {
      if (value[i] != null){
        limitedArray.push(value[i]);
      }
    }
    return limitedArray;
  }
}
