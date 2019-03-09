import { Enchantment } from "./enchantment";
import { Metal } from "./metal";
import { Element } from "./element";
import { Wood } from "./wood";
import { Weapon } from "./weapon";

export class Axe extends Weapon{

    id: number;
    name: string;
    crafter: string;
    owner: string;
    enchantment: Enchantment;
    weapon_type: string;
    head: Metal;
    head_deco: string;
    head_element: Element;
    handle: Wood;
    handle_deco:string;
    handle_element:Element;
    
    sword_description?: string;
}
