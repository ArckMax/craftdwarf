import { Metal } from "./metal";
import { Wood } from "./wood";
import { Element } from "./element";
import { Weapon } from "./weapon";
import { Enchantment } from "./enchantment";

export class Spear extends Weapon {

    id: number;
    name: string;
    crafter: string;
    owner: string;
    enchantment: Enchantment
    weapon_type: string;
    head: Metal;
    head_deco: string;
    head_element: Element;
    pole: Wood;
    pole_deco:string;
    pole_element: Element;
}
