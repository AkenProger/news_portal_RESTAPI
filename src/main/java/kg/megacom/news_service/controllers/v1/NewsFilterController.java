package kg.megacom.news_service.controllers.v1;

import kg.megacom.news_service.controllers.BaseController;
import kg.megacom.news_service.models.dto.NewsFilterDto;
import kg.megacom.news_service.services.NewsFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/newsFilter")
public class NewsFilterController implements BaseController<NewsFilterDto, Long> {
    @Autowired
    NewsFilterService newsFilterService;

    @Override
    public NewsFilterDto save(NewsFilterDto S) {
        return newsFilterService.save(S);
    }

    @Override
    public NewsFilterDto update(NewsFilterDto newsFilterDto) {
        return null;
    }

    @Override
    public List<NewsFilterDto> findAll() {
        return newsFilterService.findAll();
    }

    @Override
    public NewsFilterDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        newsFilterService.deleteById(id);
    }



}
