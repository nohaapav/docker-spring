package eu.nohaapav.example.docker.service;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Simple dto.
 *
 * @author Pavol Noha <pavol.noha@topmonks.com>
 */
public class Data {

    private String name;
    private String value;

    public Data(
            @JsonProperty("name") String name,
            @JsonProperty("value") String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
