package com.example.demo.binario;

import lombok.Data;

/**
 * DTO para cargar los mensajes y acertijos desde el archivo JSON
 * @Data genera getters, setters, equals, hashCode y toString
 */
@Data
public class StoryMessage {
    // Nivel actual del juego
    private Integer currentLevel;

    // Mensaje principal del CMD
    private String message;

    // Acertijo actual
    private String riddle;

    // Códigos de desinfección en formato binario
    private String[] desinfectionCode;

    // Respuesta correcta al acertijo
    private String answer;

    // Estado de la sala (oscuro/iluminado)
    private boolean isDark;

    // Color del texto para efectos visuales (ej: "RED")
    private String textColor;

    // Mensaje adicional del CMD
    private String cmdMessage;
}
