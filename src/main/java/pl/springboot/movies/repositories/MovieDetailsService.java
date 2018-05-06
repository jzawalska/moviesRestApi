package pl.springboot.movies.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.springboot.movies.exceptions.ResourceNotFoundException;
import pl.springboot.movies.models.MovieDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieDetailsService {
    @Autowired
    private DetailsH2Repository movieDetailsRepository;

    public List<MovieDetails> getAllMovieDetails() {
        List<MovieDetails> movieDetails = new ArrayList<>();
        movieDetailsRepository.findAll().forEach(movieDetails::add);
        return movieDetails;
    }

    public List<MovieDetails> getMovieDetails(Integer movieId) {
        List<MovieDetails> movieDetailsList = getAllMovieDetails();
        Optional<MovieDetails> theDetails = movieDetailsList.stream().filter(t -> t.getMovie().getMovieId().equals(movieId)).findFirst();

        if (!theDetails.isPresent()) {
            throw new ResourceNotFoundException();
        }
        return movieDetailsRepository.findByMovieDetailsId(theDetails.get().getMovieDetailsId());
    }

    public void addMovieDetails(MovieDetails movieDetails) {
        movieDetailsRepository.save(movieDetails);
    }
}
