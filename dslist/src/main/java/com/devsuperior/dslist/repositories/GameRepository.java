package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<GameEntity, Long> {
}
