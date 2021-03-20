package wsb.webclient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.List;

@Service
public class WebClientService {

    Object findRandomCatFact() {

        return WebClient.create("https://cat-fact.herokuapp.com")
                .get()
                .uri("/facts/random")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .cookie("ciastko", "ciastko")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }


    CatFact findRandomCatFact2() {

        return WebClient.create("https://cat-fact.herokuapp.com")
                .get()
                .uri("/facts/random")
                .retrieve()
                .bodyToMono(CatFact.class)
                .block();

    }

    Object[] getMovies() {
        return  WebClient.create("http://apollo-test.logintegra.com/rest")
                .get()
                .uri("/movies")
                .retrieve()
                .bodyToMono(Object[].class)
                .block();
    }

    Object createMovie() {

        HashMap<String, Object> director = new HashMap<>();
        director.put("name", "A");
        director.put("lastName", "B");

        HashMap<String, Object> movie = new HashMap<>();
        movie.put("title", "X");
        movie.put("year", 999);
        movie.put("director", director);

        return  WebClient.create("http://apollo-test.logintegra.com/rest")
                .post()
                .uri("/movies")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .body(BodyInserters.fromValue(movie))
                .retrieve()
                .bodyToMono(Object.class)
                .block();

    }
}
