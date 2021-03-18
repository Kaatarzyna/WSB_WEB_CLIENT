package wsb.webclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WebClientController {

    final WebClientService webClientService;

    public WebClientController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping("/")
    Object findCatFact() {
        return webClientService.findRandomCatFact();
    }

    @GetMapping("/catFact")
    CatFact findCatFact2() {
        return webClientService.findRandomCatFact2();
    }
}
