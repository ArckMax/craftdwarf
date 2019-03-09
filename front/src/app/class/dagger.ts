import { Metal } from "./metal";
import { Wood } from "./wood";
import { Element } from "./element";
import { Weapon } from "./weapon";
import { Enchantment } from "./enchantment";

export class Dagger extends Weapon {

    id: number;
    name: string;
    crafter: string;
    owner: string;
    enchantment: Enchantment;
    weapon_type: string;
    blade: Metal;
    blade_deco: string;
    blade_element: Element;
    hilt: Wood;
    hilt_deco:string;
    hilt_element: Element;
}
