package pl.springboot.movies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.springboot.movies.models.Movie;
import pl.springboot.movies.repositories.MovieService;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @RequestMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @RequestMapping(value = "/movies", method = RequestMethod.POST)
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @RequestMapping("/movies/{movieId}")
    public List<Movie> getMovie(@PathVariable("movieId") Integer movieId) {
        return movieService.getMovie(movieId);
    }
}
