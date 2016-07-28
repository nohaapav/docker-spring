package eu.nohaapav.example.docker.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Manager API.
 *
 * @author Pavol Noha <pavol.noha@topmonks.com>
 */
@RestController
public class Api {

    @Autowired
    private Client client;

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/fetch", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Data fetch() {
        return client.fetchData();
    }
}