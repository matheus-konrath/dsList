package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.GameEntity;
import com.devsuperior.dslist.exceptions.ResourceNotFoundException;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findGame(){
        List<GameEntity> list = repository.findAll();
        return list.stream().map(GameMinDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public GameDTO findGameById(Long id){
        Optional<GameEntity> obj = repository.findById(id);
        GameEntity entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
        return new GameDTO(entity);
    }
}
