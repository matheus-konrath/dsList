package com.devsuperior.dslist.dto;


import com.devsuperior.dslist.entities.GameEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GameListDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;


    public GameListDTO(GameEntity entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.genre = entity.getGenre();
        this.platforms = entity.getPlatforms();
        this.score = entity.getScore();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.longDescription = entity.getLongDescription();
    }
}
