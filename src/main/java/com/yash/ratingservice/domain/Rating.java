package com.yash.ratingservice.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Rating {

    @Id
    private String rattingId;

    @NotNull(message = "HotelId can not be null")
    private String hotelId;
    @NotNull(message = "userId can not be null")
    private String userId;

    @NotNull(message = "rating can not be null")
//    @Pattern(regexp = "^\\d{2}\\d{3}?$",message = "given Rating should be in numeric form")
    //@Size(min = 1, max = 5, message = "Rating should be in between 1 to 5")
    @Min(value = 1 , message = "Rating should be in between 1 to 5")
    @Max(value = 5, message = "Rating should be in between 1 to 5")
    private int rating;
    @NotNull(message = "feedback can not be null")
    private String feedback;

}
