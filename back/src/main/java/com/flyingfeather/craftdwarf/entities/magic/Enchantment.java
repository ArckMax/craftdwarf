package com.flyingfeather.craftdwarf.entities.magic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Enchantment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String spell_name;
	@OneToOne
	@JoinColumn(name = "element_id")
	private Element element;
	
	public Enchantment() {
		
	}

	public Enchantment(String spell_name, Element element) {
		super();
		this.spell_name = spell_name;
		this.element = element;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSpell_name() {
		return spell_name;
	}

	public void setSpell_name(String spell_name) {
		this.spell_name = spell_name;
	}

	public Element getElement() {
		return element;
	}

	public void setElement(Element element) {
		this.element = element;
	}

}
