package com.example.demo.dto;

import lombok.Data;

/**
 * DTO para recibir peticiones de llaves del cliente
 * @Data genera getters, setters, equals, hashCode y toString
 */
@Data
public class KeyRequest {
    // La llave que envía el usuario para intentar desbloquear algo
    private String key;
}
