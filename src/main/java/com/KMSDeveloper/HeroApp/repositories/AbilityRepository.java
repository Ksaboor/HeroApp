package com.KMSDeveloper.HeroApp.repositories;

import com.KMSDeveloper.HeroApp.model.Ability;
import org.springframework.data.repository.CrudRepository;
// we only need CRUD for Ability because it won't have its own endpoints
public interface AbilityRepository extends CrudRepository<Ability, Long> {
}
