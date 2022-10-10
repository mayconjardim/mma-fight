package com.mmafight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mmafight.entities.Fighter;

public interface FighterRepository extends JpaRepository<Fighter, Long> {

}
