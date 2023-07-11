package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "tb_belonging")
public class BelongingEntity {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public BelongingEntity(GameEntity entity, GameListEntity list, Integer position){
        id.setGameEntity(entity);
        id.setGameListEntity(list);
        this.position = position;
    }
}
