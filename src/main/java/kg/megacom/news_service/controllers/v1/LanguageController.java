package kg.megacom.news_service.controllers.v1;

import kg.megacom.news_service.controllers.BaseController;
import kg.megacom.news_service.models.dto.LanguageDto;
import kg.megacom.news_service.services.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/language")
public class LanguageController implements BaseController<LanguageDto, Long> {
    @Autowired
    LanguageService languageService;

    @Override
    public LanguageDto save(LanguageDto S) {
        return languageService.save(S);
    }

    @Override
    public LanguageDto update(LanguageDto languageDto) {
        return null;
    }

    @Override
    public List<LanguageDto> findAll() {
        return languageService.findAll();
    }

    @Override
    public LanguageDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }




}
