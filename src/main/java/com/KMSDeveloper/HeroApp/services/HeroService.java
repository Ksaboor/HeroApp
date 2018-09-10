package com.KMSDeveloper.HeroApp.services;

import com.KMSDeveloper.HeroApp.repositories.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class HeroService {
    @Autowired
    HeroRepository heroRepository;


    List findAll() {
        return heroRepository.findAll(Sort.by("name")).asList();
    }
}
