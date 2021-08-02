package kg.megacom.news_service.models.dto;

import kg.megacom.news_service.models.entity.Language;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
public class NewsFilterDto {
    private Long id;
    private String filterName;
    private Language language_id;
    private boolean active;
}

