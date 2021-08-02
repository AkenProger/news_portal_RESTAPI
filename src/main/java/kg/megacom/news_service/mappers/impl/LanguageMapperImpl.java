package kg.megacom.news_service.mappers.impl;

import kg.megacom.news_service.mappers.LanguageMapper;
import kg.megacom.news_service.models.dto.LanguageDto;
import kg.megacom.news_service.models.entity.Language;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LanguageMapperImpl implements LanguageMapper {
    @Override
    public LanguageDto toDto(Language language) {
        LanguageDto languageDto = new LanguageDto();
        languageDto.setId(language.getId());
        languageDto.setLang_name(language.getLang_name());
        return languageDto;
    }

    @Override
    public Language toEntity(LanguageDto languageDto) {
        Language language = new Language();
        language.setId(languageDto.getId());
        language.setLang_name(languageDto.getLang_name());
        return language;
    }

    @Override
    public List<LanguageDto> toDtos(List<Language> entities) {
        return entities.stream()
                .map(s-> toDto(s))
                .collect(Collectors.toList());
    }

    @Override
    public List<Language> toEntities(List<LanguageDto> dtos) {
        return dtos.stream()
                .map(s->toEntity(s))
                .collect(Collectors.toList());
    }
}
