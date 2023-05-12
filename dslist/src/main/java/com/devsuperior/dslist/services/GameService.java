package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameEntity;
import com.devsuperior.dslist.entities.GameListEntity;
import com.devsuperior.dslist.exceptions.ResourceNotFoundException;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional
    public List<GameDTO> findGame(){
        List<GameEntity> list = repository.findAll();
        return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
    }

    @Transactional
    public GameListDTO findGameById(Long id){
        Optional<GameEntity> obj = repository.findById(id);
        GameEntity entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new GameListDTO(entity);
    }
}
