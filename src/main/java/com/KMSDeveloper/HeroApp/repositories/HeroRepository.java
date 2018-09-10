package com.KMSDeveloper.HeroApp.repositories;

import com.KMSDeveloper.HeroApp.model.Hero;
import org.springframework.data.repository.CrudRepository;

public interface HeroRepository extends CrudRepository<Hero, Long> {
}
