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
public class Dagger extends Weapon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type = "Dagger";
	private String weapon_type;
	@OneToOne
	@JoinColumn(name = "mat_dagger_blade")
	private Metal blade;
	private String blade_deco;
	@OneToOne
	@JoinColumn(name = "elem_dagger_blade")
	private Element blade_element;
	@OneToOne
	@JoinColumn(name = "mat__dagger_handle")
	private Wood handle;
	private String handle_deco;
	@OneToOne
	@JoinColumn(name = "elem_dagger_handle")
	private Element handle_element;

	public Dagger() {

	}

	public Dagger(Metal blade, Element blade_element, Wood handle, Element handle_element, Enchantment enchantment,
			String blade_deco, String handle_deco) {
		super(enchantment);
		this.blade = blade;
		this.blade_element = blade_element;
		this.handle = handle;
		this.handle_element = handle_element;
		this.blade_deco = blade_deco;
		this.handle_deco = handle_deco;
		this.weapon_type = randomDaggerType();
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

	public Wood getHandle() {
		return handle;
	}

	public void setHandle(Wood handle) {
		this.handle = handle;
	}

	public Element getHandle_element() {
		return handle_element;
	}

	public void setHandle_element(Element handle_element) {
		this.handle_element = handle_element;
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

	public String getHandle_deco() {
		return handle_deco;
	}

	public void setHandle_deco(String handle_deco) {
		this.handle_deco = handle_deco;
	}

	public String randomDaggerType() {
		String[] weaponsType = { "Dagger", "Knife", "Stiletto", "Cinquedea", "Karambit", "Kris" };
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
