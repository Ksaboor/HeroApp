package com.KMSDeveloper.HeroApp.repositories;

import com.KMSDeveloper.HeroApp.model.Disaster;
import org.springframework.data.repository.PagingAndSortingRepository;
// we may need paging and sorting

public interface DisasterRepository extends PagingAndSortingRepository<Disaster, Long> {}
