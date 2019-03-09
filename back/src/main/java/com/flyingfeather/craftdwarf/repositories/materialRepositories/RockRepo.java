package com.flyingfeather.craftdwarf.repositories.materialRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.materials.Rock;

public interface RockRepo extends JpaRepository<Rock, Long> {

}
