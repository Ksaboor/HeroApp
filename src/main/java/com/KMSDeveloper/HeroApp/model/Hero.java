package com.KMSDeveloper.HeroApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity @Getter @Setter
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "hero")

    @ManyToMany(mappedBy = "heroes")

    @JsonIgnore

    private Long id;

    private String name;

    private List<Ability> abilities;

}
