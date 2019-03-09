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
public class Sword extends Weapon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type = "Sword";
	private String weapon_type;

	@OneToOne
	@JoinColumn(name = "mat_blade")
	private Metal blade;
	private String blade_deco;
	@OneToOne
	@JoinColumn(name = "elem_blade")
	private Element blade_element;

	@OneToOne
	@JoinColumn(name = "mat_hilt")
	private Wood hilt;
	private String hilt_deco;
	@OneToOne
	@JoinColumn(name = "elem_hilt")
	private Element hilt_element;

	@OneToOne
	@JoinColumn(name = "mat_pommel")
	private Wood pommel;
	private String pommel_deco;
	@OneToOne
	@JoinColumn(name = "elem_pommel")
	private Element pommel_element;

	public Sword() {

	}

	public Sword(Metal blade, String blade_deco, Element blade_element, Wood hilt, String hilt_deco,
			Element hilt_element, Wood pommel, String pommel_deco, Element pommel_element, Enchantment enchantment) {
		super(enchantment);
		this.blade = blade;
		this.blade_deco = blade_deco;
		this.blade_element = blade_element;
		this.hilt = hilt;
		this.hilt_deco = hilt_deco;
		this.hilt_element = hilt_element;
		this.pommel = pommel;
		this.pommel_deco = pommel_deco;
		this.pommel_element = pommel_element;
		this.weapon_type = randomSwordType();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Metal getBlade() {
		return blade;
	}

	public void setBlade(Metal blade) {
		this.blade = blade;
	}

	public Element getBlade_element() {
		return blade_element;
	}

	public void setBlade_element(Element blade_element) {
		this.blade_element = blade_element;
	}

	public Wood getHilt() {
		return hilt;
	}

	public void setHilt(Wood hilt) {
		this.hilt = hilt;
	}

	public Element getHilt_element() {
		return hilt_element;
	}

	public void setHilt_element(Element hilt_element) {
		this.hilt_element = hilt_element;
	}

	public Wood getPommel() {
		return pommel;
	}

	public void setPommel(Wood pommel) {
		this.pommel = pommel;
	}

	public Element getPommel_element() {
		return pommel_element;
	}

	public void setPommel_element(Element pommel_element) {
		this.pommel_element = pommel_element;
	}

	public String getWeapon_type() {
		return weapon_type;
	}

	public void setWeapon_type(String weapon_type) {
		this.weapon_type = weapon_type;
	}

	public String getBlade_deco() {
		return blade_deco;
	}

	public void setBlade_deco(String blade_deco) {
		this.blade_deco = blade_deco;
	}

	public String getHilt_deco() {
		return hilt_deco;
	}

	public void setHilt_deco(String hilt_deco) {
		this.hilt_deco = hilt_deco;
	}

	public String getPommel_deco() {
		return pommel_deco;
	}

	public void setPommel_deco(String pommel_deco) {
		this.pommel_deco = pommel_deco;
	}

	public String randomSwordType() {
		String[] weaponsType = { "Falchion", "Katana", "Longsword", "Saber", "Shortsword", "Rapier" };
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