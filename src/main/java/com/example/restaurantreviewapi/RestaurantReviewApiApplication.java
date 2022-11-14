package com.example.restaurantreviewapi;


import com.example.restaurantreviewapi.model.Restaurant;
import com.example.restaurantreviewapi.repository.RestaurantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class RestaurantReviewApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantReviewApiApplication.class, args);
    }
}
