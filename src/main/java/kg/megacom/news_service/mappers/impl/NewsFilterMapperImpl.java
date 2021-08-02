package kg.megacom.news_service.mappers.impl;

import kg.megacom.news_service.mappers.NewsFilterMapper;
import kg.megacom.news_service.models.dto.NewsFilterDto;
import kg.megacom.news_service.models.entity.NewsFilter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class NewsFilterMapperImpl implements NewsFilterMapper {
    @Override
    public NewsFilterDto toDto(NewsFilter newsFilter) {
        NewsFilterDto newsFilterDto = new NewsFilterDto();
        newsFilterDto.setId(newsFilter.getId());
        newsFilterDto.setFilterName(newsFilter.getFilterName());
        newsFilterDto.setActive(newsFilter.isActive());
        newsFilterDto.setLanguage_id(newsFilter.getLanguage_id());
        return newsFilterDto;
    }

    @Override
    public NewsFilter toEntity(NewsFilterDto newsFilterDto) {
        NewsFilter newsFilter = new NewsFilter();
        newsFilter.setId(newsFilterDto.getId());
        newsFilter.setFilterName(newsFilterDto.getFilterName());
        newsFilter.setActive(newsFilterDto.isActive());
        newsFilter.setLanguage_id(newsFilterDto.getLanguage_id());
        return newsFilter;
    }

    @Override
    public List<NewsFilterDto> toDtos(List<NewsFilter> entities) {
        return entities.stream()
                .map(s-> toDto(s))
                .collect(Collectors.toList());
    }

    @Override
    public List<NewsFilter> toEntities(List<NewsFilterDto> dtos) {
        return dtos.stream()
                .map(s->toEntity(s))
                .collect(Collectors.toList());
    }
}
