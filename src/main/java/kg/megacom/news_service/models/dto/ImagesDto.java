package kg.megacom.news_service.models.dto;

import kg.megacom.news_service.models.entity.NewsDetails;
import lombok.Data;

import javax.persistence.*;
@Data
public class ImagesDto {
    private Long id;
    private String imgUrl;
    private NewsDetails newsDetails_id;
    private String order_num;
    private boolean active;
}
