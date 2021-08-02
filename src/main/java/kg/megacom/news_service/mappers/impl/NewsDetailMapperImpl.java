package kg.megacom.news_service.mappers.impl;

import kg.megacom.news_service.mappers.NewsDetailMapper;
import kg.megacom.news_service.models.dto.NewsDetailDto;
import kg.megacom.news_service.models.entity.NewsDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class NewsDetailMapperImpl implements NewsDetailMapper {
    @Override
    public NewsDetailDto toDto(NewsDetails newsDetails) {
        NewsDetailDto newsDetailDto = new NewsDetailDto();
        newsDetailDto.setId(newsDetails.getId());
        newsDetailDto.setAdd_date(newsDetails.getAdd_date());
        newsDetailDto.setEdit_date(newsDetails.getEdit_date());
        newsDetailDto.setText(newsDetails.getText());
        newsDetailDto.setHeadedTitle(newsDetails.getHeadedTitle());
        newsDetailDto.setFilter_id(newsDetails.getFilter_id());
        newsDetailDto.setLanguage(newsDetails.getLanguage());
        return newsDetailDto;
    }

    @Override
    public NewsDetails toEntity(NewsDetailDto newsDetailDto) {
        NewsDetails newsDetails = new NewsDetails();
        newsDetails.setId(newsDetailDto.getId());
        newsDetails.setAdd_date(newsDetailDto.getAdd_date());
        newsDetails.setEdit_date(newsDetailDto.getEdit_date());
        newsDetails.setText(newsDetailDto.getText());
        newsDetails.setHeadedTitle(newsDetailDto.getHeadedTitle());
        newsDetails.setFilter_id(newsDetailDto.getFilter_id());
        newsDetails.setLanguage(newsDetailDto.getLanguage());
        return newsDetails;
    }

    @Override
    public List<NewsDetailDto> toDtos(List<NewsDetails> entities) {
        return entities.stream()
                .map(s-> toDto(s))
                .collect(Collectors.toList());
    }

    @Override
    public List<NewsDetails> toEntities(List<NewsDetailDto> dtos) {
        return dtos.stream()
                .map(s->toEntity(s))
                .collect(Collectors.toList());
    }
}
