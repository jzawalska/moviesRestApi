package pl.springboot.movies.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.springboot.movies.exceptions.ResourceNotFoundException;
import pl.springboot.movies.models.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MoviesH2Repository movieRepository;

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        movieRepository.findAll().forEach(movies::add);
        return movies;
    }

    public List<Movie> getMovie(Integer id) {
        List<Movie> theMovie = movieRepository.findByMovieId(id);
        if(theMovie.isEmpty()){
            throw new ResourceNotFoundException();
        }
        return movieRepository.findByMovieId(id);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }
}