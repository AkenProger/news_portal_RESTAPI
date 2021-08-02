package kg.megacom.news_service.dao;

import kg.megacom.news_service.models.entity.NewsDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NewsDetailRepository extends JpaRepository<NewsDetails, Long> {

    @Query(value = "select * from public.news_details n where n.filter_id_id = ?1", nativeQuery = true)
    List<NewsDetails> findByFilter_idEquals(Long id);

    @Query(value = "Select * from public.news_details n,public.language l where n.language_id = l.id and l.id = ?1", nativeQuery = true)
    List<NewsDetails> findByLanguageId(Long id);

    @Query(value = "Select * from public.news_details n,public.language l where n.language_id = l.id and  l.id =3", nativeQuery = true)
    List<NewsDetails> findByLanguage();

}
