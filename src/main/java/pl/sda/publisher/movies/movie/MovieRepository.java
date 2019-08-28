package pl.sda.publisher.movies.movie;

import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie,String> {
}
