package com.flyingfeather.craftdwarf.repositories.weaponsRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.weaponrecipes.Sword;

public interface SwordRepo extends JpaRepository<Sword, Long> {

}
