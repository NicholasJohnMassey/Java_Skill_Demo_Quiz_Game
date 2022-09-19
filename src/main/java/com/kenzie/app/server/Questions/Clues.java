package com.kenzie.app.server.Questions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clues {
    @JsonProperty("canon")
    private boolean canon;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("invalidCount")
    private int invalidcount;
    @JsonProperty("gameId")
    private int gameid;
    @JsonProperty("categoryId")
    private int categoryid;
    @JsonProperty("value")
    private int value;
    @JsonProperty("question")
    private static String question;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("id")
    private static int id;

    public boolean getCanon() {
        return canon;
    }

    public void setCanon(boolean canon) {
        this.canon = canon;
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
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static String getQuestion() {
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

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
