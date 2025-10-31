package com.example.demo.dto;

import lombok.Data;

/**
 * DTO para respuestas del juego al cliente
 * Contiene la información sobre el estado actual del juego
 */
@Data
public class GameResponse {
    // Mensaje informativo para el usuario
    private String message;

    // Estado actual del juego (success, error, locked, unlocked, escaped)
    private String status;

    // Pista opcional que puede ser null
    private String clue;

    // Etapa actual del juego (1, 2, 3)
    private Integer stage;

    // Constructor completo
    public GameResponse(String message, String status, String clue, Integer stage) {
        this.message = message;
        this.status = status;
        this.clue = clue;
        this.stage = stage;
    }

    // Constructor sin clue
    public GameResponse(String message, String status, Integer stage) {
        this(message, status, null, stage);
    }
}
