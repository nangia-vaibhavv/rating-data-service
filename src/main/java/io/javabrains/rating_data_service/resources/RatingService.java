package io.javabrains.rating_data_service.resources;

import io.javabrains.rating_data_service.modules.Rating;
import io.javabrains.rating_data_service.modules.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingService {
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating("foo", 4);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating (@PathVariable("userId") String userId) {
        List<Rating>ratings =  Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 5)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratings);
        return userRating;
    }
}
