package com.yash.ratingservice.repository;

import com.yash.ratingservice.domain.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating,String> {
    Optional<List<Rating>> findByUserId(String userId);


   // List<Rating> findByHotelId(String hotelId);

    Optional<List<Rating>> findByHotelId(String hotelId);
}

