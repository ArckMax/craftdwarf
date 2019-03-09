import { Weapon } from "./weapon";
import { Metal } from "./metal";
import { Element } from "./element";
import { Wood } from "./wood";
import { Enchantment } from "./enchantment";

export class Sword extends Weapon {

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
    pommel: Wood;
    pommel_deco:string;
    pommel_element: Element;

    sword_description?: string;
}
