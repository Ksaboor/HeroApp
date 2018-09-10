package com.KMSDeveloper.HeroApp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity @Getter @Setter
public class Disaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable( joinColumns = @JoinColumn(name = "disaster_id"), inverseJoinColumns = @JoinColumn(name = "hero_id"))
     private Long id;

     private String title;

     private String location;

     private Date time;

     private Boolean isResolved = false;

     private Set<Hero> heroes;

}
