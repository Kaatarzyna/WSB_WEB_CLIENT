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

    @GetMapping("/1")
    Object findBananaInfo() {
        return webClientService.findBananaInfo();
    }

    @GetMapping("/2")
    Fruit findBananaInfo2() {
        return webClientService.findBananaInfo2();
    }

}
