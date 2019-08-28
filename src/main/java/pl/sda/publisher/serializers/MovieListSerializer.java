package pl.sda.publisher.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import pl.sda.publisher.movies.movie.Movie;

import java.io.IOException;
import java.util.List;

public class MovieListSerializer extends StdSerializer<List<Movie>> {
    public MovieListSerializer() {
        this(null);
    }

    private MovieListSerializer(Class<List<Movie>> t) {
        super(t);
    }

    @Override
    public void serialize(List<Movie> value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        for (Movie item : value) {
            item.setDirector(null);
        }
        gen.writeObject(value);
    }
}