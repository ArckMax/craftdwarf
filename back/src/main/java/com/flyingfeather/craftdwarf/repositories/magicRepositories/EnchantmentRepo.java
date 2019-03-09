package com.flyingfeather.craftdwarf.repositories.magicRepositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flyingfeather.craftdwarf.entities.magic.Enchantment;

public interface EnchantmentRepo extends JpaRepository<Enchantment, Long> {

}
