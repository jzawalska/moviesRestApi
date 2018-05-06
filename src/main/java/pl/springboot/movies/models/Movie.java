package pl.springboot.movies.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;
    @NotBlank
    private String title;

    public Movie() { }

    public Movie(Integer movieId) {
        super();
        this.movieId = movieId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
