package kg.megacom.news_service.mappers;

import kg.megacom.news_service.models.dto.NewsDetailDto;
import kg.megacom.news_service.models.entity.NewsDetails;
import org.mapstruct.factory.Mappers;

public interface NewsDetailMapper extends BaseMapper<NewsDetailDto, NewsDetails> {
}
