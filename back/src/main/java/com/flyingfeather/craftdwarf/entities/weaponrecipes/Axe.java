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
public class Axe extends Weapon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String type = "Axe";
	private String weapon_type;

	@OneToOne
	@JoinColumn(name = "mat_head")
	private Metal head;
	private String head_deco;
	@OneToOne
	@JoinColumn(name = "elem_head")
	private Element head_element;

	@OneToOne
	@JoinColumn(name = "mat_handle")
	private Wood handle;
	private String handle_deco;
	@OneToOne
	@JoinColumn(name = "elem_handle")
	private Element handle_element;

	public Axe() {

	}

	public Axe(Metal head, Element head_element, Wood handle, Element handle_element, Enchantment enchantment,
			String material, String material2) {
		super(enchantment);
		this.head = head;
		this.head_element = head_element;
		this.handle = handle;
		this.handle_element = handle_element;
		this.head_deco = material;
		this.handle_deco = material2;
		this.weapon_type = randomAxeType();
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

	public String getHead_deco() {
		return head_deco;
	}

	public void setHead_deco(String head_deco) {
		this.head_deco = head_deco;
	}

	public String getHandle_deco() {
		return handle_deco;
	}

	public void setHandle_deco(String handle_deco) {
		this.handle_deco = handle_deco;
	}

	public String randomAxeType() {
		String[] weaponsType = { "Battle axe", "Throwing Axe", "Tomahawk", "Hatchet", "Dane axe" };
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