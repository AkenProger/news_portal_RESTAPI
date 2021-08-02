package kg.megacom.news_service.mappers;

import kg.megacom.news_service.models.dto.NewsFilterDto;
import kg.megacom.news_service.models.entity.NewsFilter;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

public interface NewsFilterMapper extends BaseMapper<NewsFilterDto, NewsFilter>{
}
