package com.kenzie.app.server.Questions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clues {
    @JsonIgnoreProperties("canon")
    private boolean canon;
    @JsonIgnoreProperties("game")
    private Game game;
    @JsonProperty("category")
    private Category category;
    @JsonIgnoreProperties("invalidCount")
    private int invalidcount;
    @JsonIgnoreProperties("gameId")
    private int gameid;
    @JsonIgnore(value = true)
    private int categoryId;
    @JsonIgnoreProperties("value")
    private int value;
    @JsonProperty("question")
    private String question;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("id")
    private int id;

    public boolean getCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getInvalidcount() {
        return invalidcount;
    }

    public void setInvalidcount(int invalidcount) {
        this.invalidcount = invalidcount;
    }

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public int getCategoryid() {
        return categoryId;
    }

    public void setCategoryid(int categoryid) {
        this.categoryId = categoryId;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
