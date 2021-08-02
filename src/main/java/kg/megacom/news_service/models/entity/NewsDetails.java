package kg.megacom.news_service.models.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class NewsDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String headedTitle;
    private String text;
    @OneToOne
    private NewsFilter filter_id;
    @CreationTimestamp
    private Date add_date;
    @UpdateTimestamp
    private Date edit_date;
    @ManyToOne
    private Language language;



}
