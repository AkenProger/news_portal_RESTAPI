package kg.megacom.news_service.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class NewsFilter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filterName;
    @ManyToOne
    private Language language_id;
    private boolean active;
}
