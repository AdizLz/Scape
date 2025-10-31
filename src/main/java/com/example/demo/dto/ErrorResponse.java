package com.example.demo.dto;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

/**
 * DTO para enviar respuestas de error al cliente
 * @Data genera getters, setters, equals, hashCode y toString
 * @AllArgsConstructor genera un constructor con todos los campos
 */
@Data
@AllArgsConstructor
public class ErrorResponse {
    // Mensaje de error descriptivo
    private String error;

    // Estado del error (normalmente "error")
    private String status;

    // Marca temporal del error
    private LocalDateTime timestamp;
}
