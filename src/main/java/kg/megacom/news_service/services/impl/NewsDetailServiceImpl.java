package kg.megacom.news_service.services.impl;

import io.swagger.models.Response;
import kg.megacom.news_service.dao.NewsDetailRepository;
import kg.megacom.news_service.mappers.NewsDetailMapper;
import kg.megacom.news_service.models.dto.NewsDetailDto;
import kg.megacom.news_service.models.entity.NewsDetails;
import kg.megacom.news_service.services.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsDetailServiceImpl implements NewsDetailService {

    @Autowired
    NewsDetailRepository newsDetailRepository;
    @Autowired
    NewsDetailMapper newsDetailMapper;

    @Override
    public NewsDetailDto save(NewsDetailDto newsDetailDto) {
        NewsDetails newsDetails = newsDetailMapper.toEntity(newsDetailDto);
        newsDetails = newsDetailRepository.save(newsDetails);
        return newsDetailMapper.toDto(newsDetails);
    }

    @Override
    public NewsDetailDto update(NewsDetailDto newsDetailDto) {
        if (newsDetailRepository.existsById(newsDetailDto.getId()))
            new RuntimeException("Не найден:(");
        NewsDetails newsDetails = newsDetailMapper.toEntity(newsDetailDto);
        newsDetails = newsDetailRepository.save(newsDetails);
        return newsDetailMapper.toDto(newsDetails);
    }

    @Override
    public List<NewsDetailDto> findAll() {
        return newsDetailMapper.toDtos(newsDetailRepository.findAll());
    }

    @Override
    public NewsDetailDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) { }

    @Override
    public List<NewsDetailDto> findByFilter(Long id) {
        return newsDetailMapper.toDtos(newsDetailRepository.findByFilter_idEquals(id));
    }

    @Override
    public List<NewsDetailDto> findByLanguageId(Long id) {
        return newsDetailMapper.toDtos(newsDetailRepository.findByLanguageId(id));
    }

    @Override
    public List<NewsDetailDto> findDefaultLanguage() {
        return newsDetailMapper.toDtos(newsDetailRepository.findByLanguage());
    }


}
