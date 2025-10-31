package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AnswerRequest {
    @JsonProperty("last_key")
    private String lastKey;

    private String answer;

    public String getLastKey() {
        return lastKey;
    }

    public void setLastKey(String lastKey) {
        this.lastKey = lastKey;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
