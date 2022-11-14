package com.example.restaurantreviewapi.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name = "\"user\"")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String displayName;

    private String city;
    private String state;
    private String zipCode;

    private Boolean peanutWatch;
    private Boolean eggWatch;
    private Boolean dairyWatch;

}
