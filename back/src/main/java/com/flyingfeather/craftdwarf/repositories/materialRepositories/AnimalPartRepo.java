package com.flyingfeather.craftdwarf.repositories.materialRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.materials.AnimalPart;

public interface AnimalPartRepo extends JpaRepository<AnimalPart, Long> {

}
