package kg.megacom.news_service.services.impl;

import kg.megacom.news_service.dao.LanguageRepository;
import kg.megacom.news_service.mappers.LanguageMapper;
import kg.megacom.news_service.models.dto.LanguageDto;
import kg.megacom.news_service.models.entity.Language;
import kg.megacom.news_service.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    LanguageRepository languageRepository;
    @Autowired
    LanguageMapper languageMapper;

    @Override
    public LanguageDto save(LanguageDto languageDto) {
        Language language = languageMapper.toEntity(languageDto);
        language = languageRepository.save(language);
        return languageMapper.toDto(language);
    }

    @Override
    public LanguageDto update(LanguageDto languageDto) {
        return null;
    }

    @Override
    public List<LanguageDto> findAll() {
        return languageMapper.toDtos(languageRepository.findAll());
    }

    @Override
    public LanguageDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
