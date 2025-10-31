package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.*;
import com.example.demo.service.*;

@RestController
@RequestMapping("/api/game")
@CrossOrigin(origins = "*")
public class EscapeRoomController {

    @Autowired
    private GameService gameService;

    @GetMapping("/level/{level}")
    public ResponseEntity<GameStateResponse> getLevel(@PathVariable int level) {
        GameStateResponse response = gameService.getLevelData(level);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/level/{level}")
    public ResponseEntity<AnswerResponse> submitAnswer(
            @PathVariable int level,
            @RequestBody AnswerRequest request) {
        AnswerResponse response = gameService.checkAnswer(level, request);
        return ResponseEntity.ok(response);
    }
}
