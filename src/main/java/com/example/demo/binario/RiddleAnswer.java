package com.example.demo.binario;

import lombok.Data;

/**
 * DTO para manejar las respuestas del usuario a los acertijos
 */
@Data
public class RiddleAnswer {
    // Última llave obtenida por el usuario
    private String lastKey;

    // Respuesta proporcionada por el usuario
    private String answer;
}
