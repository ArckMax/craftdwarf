package com.flyingfeather.craftdwarf.entities.materials;

import javax.persistence.Entity;

import com.flyingfeather.craftdwarf.abstracts.Material;
import com.flyingfeather.craftdwarf.abstracts.MaterialOrDecoration;

@Entity
public class AnimalPart extends Material implements MaterialOrDecoration {

	private String originAnimal;
	
	public AnimalPart() {
		
	}

	public AnimalPart(String name, int quality, String originAnimal) {
		super();
		this.originAnimal = originAnimal;
	}

	public String getOriginAnimal() {
		return originAnimal;
	}

	public void setOriginAnimal(String originAnimal) {
		this.originAnimal = originAnimal;
	}

}
