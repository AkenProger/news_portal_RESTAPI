package kg.megacom.news_service.services.impl;

import kg.megacom.news_service.dao.NewsDetailRepository;
import kg.megacom.news_service.dao.NewsFilterRepository;
import kg.megacom.news_service.mappers.NewsDetailMapper;
import kg.megacom.news_service.mappers.NewsFilterMapper;
import kg.megacom.news_service.models.dto.NewsFilterDto;
import kg.megacom.news_service.models.entity.NewsFilter;
import kg.megacom.news_service.services.NewsFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsFilterServiceImpl implements NewsFilterService {
    @Autowired
    NewsFilterMapper newsFilterMapper;
    @Autowired
    NewsFilterRepository newsFilterRepository;

    @Override
    public NewsFilterDto save(NewsFilterDto newsFilterDto) {
        NewsFilter newsFilter = newsFilterMapper.toEntity(newsFilterDto);
        newsFilter = newsFilterRepository.save(newsFilter);
        return newsFilterMapper.toDto(newsFilter);
    }

    @Override
    public NewsFilterDto update(NewsFilterDto newsFilterDto) {
        return null;
    }

    @Override
    public List<NewsFilterDto> findAll() {
        return newsFilterMapper.toDtos(newsFilterRepository.findAll());
    }

    @Override
    public NewsFilterDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
