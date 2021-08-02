package kg.megacom.news_service.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Images {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imgUrl;
    @ManyToOne
    @JoinColumn(name = "news_detail_id")
    private NewsDetails newsDetails_id;
    private String order_num;
    private boolean active;
}
