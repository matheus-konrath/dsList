package com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.entities.GameListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameListEntity, Long> {
}
