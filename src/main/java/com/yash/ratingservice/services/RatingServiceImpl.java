package com.yash.ratingservice.services;

import com.yash.ratingservice.domain.Rating;
import com.yash.ratingservice.exception.ResourceNotFoundException;
import com.yash.ratingservice.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService{
    @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating addRating(Rating rating) {
        rating.setRattingId(UUID.randomUUID().toString());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId).orElseThrow(()->new ResourceNotFoundException("No rating found for this userId "+userId ));
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId).orElseThrow(()->new ResourceNotFoundException("No rating found for this hotelId "+hotelId ));
    }
}
