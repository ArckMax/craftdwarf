package com.flyingfeather.craftdwarf.repositories.materialRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.materials.Metal;

public interface MetalRepo extends JpaRepository<Metal, Long> {

}
