package com.flyingfeather.craftdwarf.abstracts;

import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import com.flyingfeather.craftdwarf.entities.magic.Enchantment;

@MappedSuperclass
public abstract class Weapon {

	private String name;
	private String crafter;
	private String owner;
	@OneToOne
	@JoinColumn(name = "enchantment")
	private Enchantment enchantment;
	
	public Weapon() {
	}
	
	public Weapon(Enchantment enchantment) {
		this.enchantment = enchantment;
	}

	public Weapon(String name, String crafter, String owner, Enchantment enchantment) {
		super();
		this.name = name;
		this.crafter = crafter;
		this.owner = owner;
		this.enchantment = enchantment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCrafter() {
		return crafter;
	}

	public void setCrafter(String crafter) {
		this.crafter = crafter;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Enchantment getEnchantment() {
		return enchantment;
	}

	public void setEnchantment(Enchantment enchantment) {
		this.enchantment = enchantment;
	}

}
