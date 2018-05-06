package pl.springboot.movies.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.springboot.movies.models.Movie;

import java.util.List;

public interface MoviesH2Repository extends CrudRepository<Movie, Integer> {
    List<Movie> findByMovieId(Integer id);
}