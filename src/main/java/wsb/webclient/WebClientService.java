package wsb.webclient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

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
}
