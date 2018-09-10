package com.KMSDeveloper.HeroApp.repositories;

import com.KMSDeveloper.HeroApp.model.Disaster;
import org.springframework.data.repository.CrudRepository;
// we may need paging and sorting

public interface DisasterRepository extends CrudRepository<Disaster, Long> {}
