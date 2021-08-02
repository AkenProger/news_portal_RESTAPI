package kg.megacom.news_service.controllers.v1;

import kg.megacom.news_service.models.dto.ImagesDto;
import kg.megacom.news_service.models.dto.NewsDetailDto;
import kg.megacom.news_service.services.ImageService;
import kg.megacom.news_service.services.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/shower")
public class NewsController {
    @Autowired 
    private NewsDetailService newsDetailService;

    @Autowired
    private ImageService imageService;

    @GetMapping("/showAllNews")
    public List<NewsDetailDto> getAllNews() {
        return newsDetailService.findAll();
    }
    
    @GetMapping("/showByCategoryId/{id}")
    public List<NewsDetailDto> getByFilter(@PathVariable Long id) {
        return newsDetailService.findByFilter(id);
    }
    
    @GetMapping("/translateById/{id}")
    public List<NewsDetailDto> getByLanguage(@PathVariable Long id) {
        return newsDetailService.findByLanguageId(id);
    }

    @GetMapping("/getDefaultLanguage")
    public List<NewsDetailDto> getDefaultLanguage() {
        return newsDetailService.findDefaultLanguage();
    }

    @GetMapping("/getAllImages")
    public List<ImagesDto> getAllImages() {
        return imageService.findAll();
    }
}
