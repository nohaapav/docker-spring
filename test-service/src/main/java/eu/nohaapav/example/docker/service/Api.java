package eu.nohaapav.example.docker.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Service API.
 *
 * @author Pavol Noha <pavol.noha@topmonks.com>
 */
@RestController
public class Api {

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/fetch", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Data fetch() {
        return new Data("DATA", "These data were fetched from test-service");
    }
}