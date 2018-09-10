package com.KMSDeveloper.HeroApp.repositories;

import com.KMSDeveloper.HeroApp.model.Hero;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HeroRepository extends PagingAndSortingRepository<Hero, Long> {

}
