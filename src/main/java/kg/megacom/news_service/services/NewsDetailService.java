package kg.megacom.news_service.services;

import kg.megacom.news_service.models.dto.NewsDetailDto;

import java.util.List;

public interface NewsDetailService extends BaseCrudService<NewsDetailDto, Long>{
    List<NewsDetailDto> findByFilter(Long id);

    List<NewsDetailDto> findByLanguageId(Long id);

    List<NewsDetailDto> findDefaultLanguage();

    List<NewsDetailDto> findByLanguageName(String name);
}
