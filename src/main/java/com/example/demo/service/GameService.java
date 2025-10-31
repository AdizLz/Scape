package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.dto.*;

@Service
public class GameService {

    // Respuestas correctas para cada nivel
    private static final String[] CORRECT_ANSWERS = {
            "316",     // Nivel 1
            "50",      // Nivel 2
            "1001-1011-1100-1110"  // Nivel 3
    };

    // Llaves para acceder a cada nivel
    private static final String[] LEVEL_KEYS = {
            null,  // Nivel 1 no requiere llave
            "316", // Nivel 2 requiere llave del nivel 1
            "50"   // Nivel 3 requiere llave del nivel 2
    };

    public GameStateResponse getLevelData(int level) {
        GameStateResponse response = new GameStateResponse();
        response.setCurrentLevel(level);

        switch (level) {
            case 1:
                response.setRiddle("LOG DE ERROR CRÍTICO: El sistema de acceso requiere la clave de error en formato decimal. El virus ha cifrado la clave. Deben convertir el siguiente dato a decimal para obtener el código de acceso.");
                response.setBinaryCode(new String[]{"011", "001", "110"});
                break;

            case 2:
                response.setRiddle("¡Bien hecho! El virus se ha replicado y ha modificado las frecuencias de audio para proteger la siguiente sala. La clave de acceso es la suma de las frecuencias críticas. Conviertan los datos binarios del diagrama de frecuencias.");
                response.setFrequencies(new Frequency[]{
                        new Frequency("Alfa", "10001"),
                        new Frequency("Beta", "1100"),
                        new Frequency("Gamma", "10101")
                });
                break;

            case 3:
                response.setRiddle("¡ATENCIÓN! CÓDIGO DE DESACTIVACIÓN. Para detener el virus, deben ingresar los 4 códigos de desinfección en el orden correcto. El orden es de menor a mayor de sus conversiones decimales.");
                response.setDesinfectionCode(new String[]{"1110", "1001", "1011", "1100"});
                break;

            default:
                response.setRiddle("Nivel no encontrado");
        }

        return response;
    }

    public AnswerResponse checkAnswer(int level, AnswerRequest request) {
        AnswerResponse response = new AnswerResponse();

        // Validar llave del nivel anterior (excepto nivel 1)
        if (level > 1) {
            String requiredKey = LEVEL_KEYS[level - 1];
            if (request.getLastKey() == null || !request.getLastKey().equals(requiredKey)) {
                response.setCorrect(false);
                response.setMessage("Llave del nivel anterior incorrecta. No puedes acceder a este nivel.");
                response.setNextLevel(level - 1);
                return response;
            }
        }

        // Validar respuesta del nivel actual
        String correctAnswer = CORRECT_ANSWERS[level - 1];
        boolean isCorrect = request.getAnswer() != null &&
                request.getAnswer().trim().equals(correctAnswer);

        response.setCorrect(isCorrect);

        if (isCorrect) {
            if (level < 3) {
                response.setMessage("¡Correcto! La llave es: " + correctAnswer);
                response.setNextLevel(level + 1);
            } else {
                response.setMessage("¡FELICIDADES! Has desactivado el virus y escapado con éxito.");
                response.setNextLevel(level);
            }
        } else {
            response.setMessage("Respuesta incorrecta. Intenta nuevamente.");
            response.setNextLevel(level);
        }

        return response;
    }

    // Clase interna para frecuencias
    public static class Frequency {
        private String name;
        private String binaryValue;

        public Frequency(String name, String binaryValue) {
            this.name = name;
            this.binaryValue = binaryValue;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBinaryValue() {
            return binaryValue;
        }

        public void setBinaryValue(String binaryValue) {
            this.binaryValue = binaryValue;
        }
    }
}