package com.flyingfeather.craftdwarf.entities.weaponrecipes;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.flyingfeather.craftdwarf.abstracts.Weapon;
import com.flyingfeather.craftdwarf.entities.magic.Element;
import com.flyingfeather.craftdwarf.entities.magic.Enchantment;
import com.flyingfeather.craftdwarf.entities.materials.Metal;
import com.flyingfeather.craftdwarf.entities.materials.Wood;

@Entity
public class Spear extends Weapon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type = "Spear";
	private String weapon_type;
	@OneToOne
	@JoinColumn(name = "mat_head")
	private Metal head;
	private String head_deco;
	@OneToOne
	@JoinColumn(name = "elem_head")
	private Element head_element;
	@OneToOne
	@JoinColumn(name = "mat_pole")
	private Wood pole;
	private String pole_deco;
	@OneToOne
	@JoinColumn(name = "elem_pole")
	private Element pole_element;

	public Spear() {

	}

	public Spear(Metal head, Element head_element, Wood pole, Element pole_element, Enchantment enchantment,
			String head_deco, String pole_deco) {
		super(enchantment);
		this.head = head;
		this.head_deco = head_deco;
		this.head_element = head_element;
		this.pole = pole;
		this.pole_deco = pole_deco;
		this.pole_element = pole_element;
		this.weapon_type = randomSpearType();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Metal getHead() {
		return head;
	}

	public void setHead(Metal head) {
		this.head = head;
	}

	public Element getHead_element() {
		return head_element;
	}

	public void setHead_element(Element head_element) {
		this.head_element = head_element;
	}

	public Wood getPole() {
		return pole;
	}

	public void setPole(Wood pole) {
		this.pole = pole;
	}

	public Element getPole_element() {
		return pole_element;
	}

	public void setPole_element(Element pole_element) {
		this.pole_element = pole_element;
	}

	public String getWeapon_type() {
		return weapon_type;
	}

	public void setWeapon_type(String weapon_type) {
		this.weapon_type = weapon_type;
	}

	public String getHead_deco() {
		return head_deco;
	}

	public void setHead_deco(String head_deco) {
		this.head_deco = head_deco;
	}

	public String getPole_deco() {
		return pole_deco;
	}

	public void setPole_deco(String pole_deco) {
		this.pole_deco = pole_deco;
	}

	public String randomSpearType() {
		String[] weaponsType = { "Naginata", "Halberd", "Partisan", "Pike", "Trident", "Glaive", "Lance", "Harpoon",
				"Javelin", "Pilum", "Assegai"};
		int randomNum = new Random().nextInt(weaponsType.length);
		return weaponsType[randomNum];
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
