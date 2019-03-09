package com.flyingfeather.craftdwarf.repositories.magicRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.magic.Element;

public interface ElementRepo extends JpaRepository<Element, Long> {

}
