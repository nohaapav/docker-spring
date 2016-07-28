package eu.nohaapav.example.docker.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Service client.
 *
 * @author Pavol Noha <pavol.noha@topmonks.com>
 */
@Component
public class Client {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.api.fetch}")
    private String fetchUrl;

    public Data fetchData() {
        return restTemplate.getForObject(fetchUrl, Data.class);
    }
}
