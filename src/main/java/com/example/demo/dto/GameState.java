package com.example.demo.dto;

import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

/**
 * Componente que mantiene el estado del juego
 * Se usa @Component para que sea un Singleton gestionado por Spring
 */
@Component
public class GameState {
    // Conjunto de llaves que el jugador ha recolectado
    private Set<String> collectedKeys = new HashSet<>();

    // Etapa actual del juego
    private int currentStage = 1;

    // Estado de la puerta (bloqueada/desbloqueada)
    private boolean doorUnlocked = false;

    // Estado de exploración del pasillo
    private boolean hallwayExplored = false;

    // Llaves necesarias para completar el juego
    public static final Set<String> REQUIRED_KEYS = Set.of("llave1", "llave2", "llave3");

    // Añade una nueva llave a la colección
    public void addKey(String key) {
        collectedKeys.add(key);
    }

    // Verifica si tiene una llave específica
    public boolean hasKey(String key) {
        return collectedKeys.contains(key);
    }

    // Verifica si tiene todas las llaves necesarias
    public boolean hasAllKeys() {
        return collectedKeys.containsAll(REQUIRED_KEYS);
    }

    // Avanza a la siguiente etapa
    public void advanceStage() {
        this.currentStage++;
    }

    // Reinicia el estado del juego
    public void reset() {
        collectedKeys.clear();
        currentStage = 1;
        doorUnlocked = false;
        hallwayExplored = false;
    }
}
