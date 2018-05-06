package pl.springboot.movies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import pl.springboot.movies.models.Movie;
import pl.springboot.movies.models.MovieDetails;
import pl.springboot.movies.repositories.MovieDetailsService;

import java.util.List;

@RestController
public class MovieDetailsController {
    @Autowired
    private MovieDetailsService movieDetailsService;

    @RequestMapping("/movies/{movieId}/details")
    public List<MovieDetails> getMovieDetails(@PathVariable("movieId") Integer movieId) {
        List<MovieDetails> movieDetails = movieDetailsService.getMovieDetails(movieId);
        return movieDetails;
    }

    @RequestMapping(value = "/movies/{movieId}/details", method = RequestMethod.POST)
    public void addMovieDetails(@RequestBody MovieDetails movieDetails, @PathVariable("movieId") Integer movieId) {
        movieDetails.setMovie(new Movie(movieId));
        movieDetailsService.addMovieDetails(movieDetails);
    }
}
