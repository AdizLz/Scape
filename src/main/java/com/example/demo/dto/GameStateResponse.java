package com.example.demo.dto;

import com.example.demo.service.GameService.Frequency;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GameStateResponse {
    private int currentLevel;
    private String riddle;
    private String[] binaryCode;
    private Frequency[] frequencies;
    private String[] desinfectionCode;

    // Getters y Setters
    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public String getRiddle() {
        return riddle;
    }

    public void setRiddle(String riddle) {
        this.riddle = riddle;
    }

    public String[] getBinaryCode() {
        return binaryCode;
    }

    public void setBinaryCode(String[] binaryCode) {
        this.binaryCode = binaryCode;
    }

    public Frequency[] getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(Frequency[] frequencies) {
        this.frequencies = frequencies;
    }

    public String[] getDesinfectionCode() {
        return desinfectionCode;
    }

    public void setDesinfectionCode(String[] desinfectionCode) {
        this.desinfectionCode = desinfectionCode;
    }
}
