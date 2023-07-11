package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameListEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameListEntity entity){
        BeanUtils.copyProperties(entity,this);
    }
}
