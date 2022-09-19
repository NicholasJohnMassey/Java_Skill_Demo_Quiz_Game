package com.kenzie.app.server.Questions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {
    @JsonIgnoreProperties("canon")
    private boolean canon;
    @JsonIgnoreProperties("aired")
    private String aired;

    public boolean getCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    public String getAired() {
        return aired;
    }

    public void setAired(String aired) {
        this.aired = aired;
    }
}
