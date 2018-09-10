package com.KMSDeveloper.HeroApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
/*

 */

/**
 *
 *
 *
 *
 *
 *
 *
 */
// tell persistence provider 'Ability' is a persistence entity
@Entity
@Getter @Setter
public class Ability {
    // tell persistence provider 'id' is primary key
    @Id
    // tell persistence provider that value of 'id' will be generated
    // use RDBMS unique id generator
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JsonIgnore
    // tell Spring to ignore 'hero' when creating JSON

    private Long id;
    private String name;
    // tell persistence provider 'hero' is a many-to-one relation with Ability
    // do not fetch value when Ability is loaded
    // will make the foreign key mandatory

}
