package kg.megacom.news_service.dao;

import kg.megacom.news_service.models.entity.Images;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Images, Long> {

}
