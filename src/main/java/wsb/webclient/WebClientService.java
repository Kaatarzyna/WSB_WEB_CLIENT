package wsb.webclient;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class WebClientService {

    Object findBananaInfo() {

        return WebClient.create("https://www.fruityvice.com")
                .get()
                .uri("/api/fruit/banana")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .cookie("ciastko", "ciastko")
                .retrieve()
                .bodyToMono(Object.class)
                .block();
    }


    Fruit findBananaInfo2() {

        return WebClient.create("https://www.fruityvice.com")
                .get()
                .uri("/api/fruit/banana")
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(Fruit.class)
                .block();

    }
}
