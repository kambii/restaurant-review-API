package com.example.restaurantreviewapi.repository;

import com.example.restaurantreviewapi.model.Review;
import com.example.restaurantreviewapi.model.ReviewStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReviewRepository extends CrudRepository<Review, Long> {
    List<Review> findReviewsByRestaurantIdAndStatus(Long restaurantId, ReviewStatus reviewStatus);
    List<Review> findReviewsByStatus(ReviewStatus reviewStatus);
}
