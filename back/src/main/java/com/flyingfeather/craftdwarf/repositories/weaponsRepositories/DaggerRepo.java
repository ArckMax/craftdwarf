package com.flyingfeather.craftdwarf.repositories.weaponsRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.weaponrecipes.Dagger;

public interface DaggerRepo extends JpaRepository<Dagger, Long> {

}
