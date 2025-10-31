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
                response.setRiddle("LOG CRITIC ERROR : The access system requires the error key in decimal format. The virus has encrypted the key. You must convert the following data to decimal to obtain the access code: ");
                response.setBinaryCode(new String[]{"011", "001", "110"});
                break;

            case 2:
                response.setRiddle("Well done! The virus has replicated itself and modified the audio frequencies to protect the next room. The access code is the sum of the critical frequencies. To find them, use the frequency diagram and convert the binary data.");
                response.setFrequencies(new Frequency[]{
                        new Frequency("Alfa", "10001"),
                        new Frequency("Beta", "1100"),
                        new Frequency("Gamma", "10101")
                });
                break;

            case 3:
                response.setRiddle("¡Atention!. To stop the virus, you must enter the 4 disinfection codes in the correct order. The order is from the smallest to the largest of their decimal conversions.  ");
                response.setDesinfectionCode(new String[]{"1110", "1001", "1011", "1100"});
                break;

            default:
                response.setRiddle("Nivel doesnt found");
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
                response.setMessage("Incorrect key for the previous level. You cannot access this level.");
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
                response.setMessage("¡Correct! The key is: " + correctAnswer);
                response.setNextLevel(level + 1);
            } else {
                response.setMessage("¡Congratulations! You have deactivated the virus and escaped successfully.");
                response.setNextLevel(level);
            }
        } else {
            response.setMessage("Incorrect answer. Try again.");
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