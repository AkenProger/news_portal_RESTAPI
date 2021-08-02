package kg.megacom.news_service.models.dto;

import kg.megacom.news_service.models.entity.Language;
import kg.megacom.news_service.models.entity.NewsFilter;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
public class NewsDetailDto {
    private Long id;
    private String headedTitle;
    private String text;
    private NewsFilter filter_id;
    private Date add_date;
    private Date edit_date;
    private Language language;
}
