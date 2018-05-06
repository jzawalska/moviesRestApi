package pl.springboot.movies.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class MovieDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieDetailsId;
    @OneToOne
    private Movie movie;
    private Genre genre;
    private String description;


    public MovieDetails() { }

    public MovieDetails(Genre genre, String description, Movie movie) {
        super();
        this.genre = genre;
        this.description = description;
        this.movie = new Movie(movie.getMovieId());
    }

    public Integer getMovieDetailsId() {
        return movieDetailsId;
    }

    public void setMovieDetailsId(Integer movieDetailsId) {
        this.movieDetailsId = movieDetailsId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
