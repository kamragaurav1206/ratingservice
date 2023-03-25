package com.yash.ratingservice.services;

import com.yash.ratingservice.domain.Rating;

import java.util.List;

public interface RatingService {

    public Rating addRating(Rating rating);

    public List<Rating> getAllRating();

    public List<Rating> getRatingByUserId(String userId);

    public List<Rating> getRatingByHotelId(String hotelId);
}
