package com.flyingfeather.craftdwarf.repositories.materialRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.materials.Wood;

public interface WoodRepo extends JpaRepository<Wood, Long> {

}
