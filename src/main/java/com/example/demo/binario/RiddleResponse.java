package com.example.demo.binario;

import lombok.Data;
import lombok.AllArgsConstructor;

/**
 * DTO para las respuestas del servidor a las respuestas de los acertijos
 */
@Data
@AllArgsConstructor
public class RiddleResponse {
    // Indica si la respuesta fue correcta
    private boolean correct;

    // Mensaje de retroalimentación (ej: "correct, the key is: 316")
    private String message;

    // Siguiente nivel al que avanza el jugador
    private Integer nextLevel;
}
