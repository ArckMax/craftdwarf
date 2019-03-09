package com.flyingfeather.craftdwarf.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flyingfeather.craftdwarf.abstracts.Material;
import com.flyingfeather.craftdwarf.abstracts.Weapon;
import com.flyingfeather.craftdwarf.entities.magic.Element;
import com.flyingfeather.craftdwarf.entities.magic.Enchantment;
import com.flyingfeather.craftdwarf.entities.materials.AnimalPart;
import com.flyingfeather.craftdwarf.entities.materials.Metal;
import com.flyingfeather.craftdwarf.entities.materials.Rock;
import com.flyingfeather.craftdwarf.entities.materials.Wood;
import com.flyingfeather.craftdwarf.entities.weaponrecipes.Axe;
import com.flyingfeather.craftdwarf.entities.weaponrecipes.Dagger;
import com.flyingfeather.craftdwarf.entities.weaponrecipes.Spear;
import com.flyingfeather.craftdwarf.entities.weaponrecipes.Sword;
import com.flyingfeather.craftdwarf.repositories.magicRepositories.ElementRepo;
import com.flyingfeather.craftdwarf.repositories.magicRepositories.EnchantmentRepo;
import com.flyingfeather.craftdwarf.repositories.materialRepositories.AnimalPartRepo;
import com.flyingfeather.craftdwarf.repositories.materialRepositories.MetalRepo;
import com.flyingfeather.craftdwarf.repositories.materialRepositories.RockRepo;
import com.flyingfeather.craftdwarf.repositories.materialRepositories.WoodRepo;
import com.flyingfeather.craftdwarf.repositories.weaponsRepositories.AxeRepo;
import com.flyingfeather.craftdwarf.repositories.weaponsRepositories.DaggerRepo;
import com.flyingfeather.craftdwarf.repositories.weaponsRepositories.SpearRepo;
import com.flyingfeather.craftdwarf.repositories.weaponsRepositories.SwordRepo;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class BlacksmithController {

//	Material Repositories
	@Autowired
	MetalRepo metalRepo;
	@Autowired
	WoodRepo woodRepo;
	@Autowired
	RockRepo rockRepo;
	@Autowired
	AnimalPartRepo animalPartRepo;

//	Magic Repositories
	@Autowired
	ElementRepo elementRepo;
	@Autowired
	EnchantmentRepo enchantmentRepo;

//	Weapon Repositories
	@Autowired
	AxeRepo axeRepo;
	@Autowired
	SwordRepo swordRepo;
	@Autowired
	SpearRepo spearRepo;
	@Autowired
	DaggerRepo daggerRepo;

	@GetMapping("/weapons/create")
	public Weapon craftAWeapon() {

		List<Metal> metalList = new ArrayList<Metal>();
		metalRepo.findAll().forEach(metalList::add);

		List<Wood> woodList = new ArrayList<Wood>();
		woodRepo.findAll().forEach(woodList::add);

		List<Rock> rockList = new ArrayList<Rock>();
		rockRepo.findAll().forEach(rockList::add);

		List<AnimalPart> animalPartList = new ArrayList<AnimalPart>();
		animalPartRepo.findAll().forEach(animalPartList::add);

		List<Material> allMaterialsList = new ArrayList<Material>();
		metalList.forEach(allMaterialsList::add);
		woodList.forEach(allMaterialsList::add);
		rockList.forEach(allMaterialsList::add);
		animalPartList.forEach(allMaterialsList::add);

		String choosenItem = chooseARandomRecipe();

		if (choosenItem == "Axe") {
			Axe craftedAxe = new Axe(getARandomMetal(metalList), chooseARandomElement(), getARandomWood(woodList),
					chooseARandomElement(), chooseARandomEnchantment(), getARandomMaterial(allMaterialsList),
					getARandomMaterial(allMaterialsList));
			return axeRepo.save(craftedAxe);

		} else if (choosenItem == "Sword") {
			Sword craftedSword = new Sword(getARandomMetal(metalList), getARandomMaterial(allMaterialsList),
					chooseARandomElement(), getARandomWood(woodList), getARandomMaterial(allMaterialsList),
					chooseARandomElement(), getARandomWood(woodList), getARandomMaterial(allMaterialsList),
					chooseARandomElement(), chooseARandomEnchantment());
			return swordRepo.save(craftedSword);

		} else if (choosenItem == "Spear") {
			Spear craftedSpear = new Spear(getARandomMetal(metalList), chooseARandomElement(), getARandomWood(woodList),
					chooseARandomElement(), chooseARandomEnchantment(), getARandomMaterial(allMaterialsList),
					getARandomMaterial(allMaterialsList));
			return spearRepo.save(craftedSpear);

		} else if (choosenItem == "Dagger") {
			Dagger craftedDagger = new Dagger(getARandomMetal(metalList), chooseARandomElement(),
					getARandomWood(woodList), chooseARandomElement(), chooseARandomEnchantment(),
					getARandomMaterial(allMaterialsList), getARandomMaterial(allMaterialsList));
			return daggerRepo.save(craftedDagger);

		} else {

			return null;
		}

	}

	@GetMapping("/weapons/axes")
	public List<Weapon> getAllAxes() {
		List<Weapon> weapons = new ArrayList<>();
		axeRepo.findAll().forEach(weapons::add);

		return weapons;
	}

	@GetMapping("/weapons/spears")
	public List<Weapon> getAllSpears() {
		List<Weapon> weapons = new ArrayList<>();
		spearRepo.findAll().forEach(weapons::add);

		return weapons;
	}

	@GetMapping("/weapons/swords")
	public List<Weapon> getAllSwords() {
		List<Weapon> weapons = new ArrayList<>();
		swordRepo.findAll().forEach(weapons::add);

		return weapons;
	}

	@GetMapping("/weapons/daggers")
	public List<Weapon> getAllDaggers() {
		List<Weapon> weapons = new ArrayList<>();
		daggerRepo.findAll().forEach(weapons::add);

		return weapons;
	}

//	Random choice among lists functions

	public String chooseARandomRecipe() {
		String[] RecipeList = { "Axe", "Sword", "Spear", "Dagger" };
		int randomNum = new Random().nextInt(RecipeList.length);
		String randomRecipe = RecipeList[randomNum];
		return randomRecipe;
	}

	public Metal getARandomMetal(List<Metal> metalList) {
		Random rand = new Random();
		return metalList.get(rand.nextInt(metalList.size()));
	}

	public Wood getARandomWood(List<Wood> woodList) {
		Random rand = new Random();
		return woodList.get(rand.nextInt(woodList.size()));
	}

	public String getARandomMaterial(List<Material> allMaterialsList) {
		Random rand = new Random();
		Material tmpMat = allMaterialsList.get(rand.nextInt(allMaterialsList.size()));
		return tmpMat.getName();
	}

	public Element chooseARandomElement() {
		List<Element> ElementList = elementRepo.findAll();
		int randomNum = new Random().nextInt(ElementList.size());
		Element randomElement = ElementList.get(randomNum);
		return randomElement;
	}

	public Enchantment chooseARandomEnchantment() {
		List<Enchantment> enchantmentList = enchantmentRepo.findAll();
		int randomNum = new Random().nextInt(enchantmentList.size());
		Enchantment randomEnchant = enchantmentList.get(randomNum);
		return randomEnchant;
	}

}
