package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public ResponseEntity<List<GameMinDTO>> findAll(){
        List<GameMinDTO> list = gameService.findGame();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<GameDTO> findGamesById(@PathVariable Long id){
        GameDTO list = gameService.findGameById(id);
        return ResponseEntity.ok().body(list);
    }
}
