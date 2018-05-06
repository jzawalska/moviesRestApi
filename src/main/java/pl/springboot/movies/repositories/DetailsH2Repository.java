package pl.springboot.movies.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.springboot.movies.models.Movie;
import pl.springboot.movies.models.MovieDetails;

import java.util.List;

public interface DetailsH2Repository extends CrudRepository<MovieDetails, Integer> {
    List<MovieDetails> findByMovieDetailsId(Integer id);
}
