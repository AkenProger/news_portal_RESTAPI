package kg.megacom.news_service.controllers.v1;

import kg.megacom.news_service.controllers.BaseController;
import kg.megacom.news_service.models.dto.NewsDetailDto;
import kg.megacom.news_service.services.NewsDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/newsDetails")
public class NewsDetailController implements BaseController<NewsDetailDto, Long> {

    @Autowired
    NewsDetailService newsDetailService;

    @Override
    public NewsDetailDto save(NewsDetailDto S) {
        return newsDetailService.save(S);
    }

    @Override
    public NewsDetailDto update(NewsDetailDto newsDetailDto) {
        return null;
    }

    @Override
    public List<NewsDetailDto> findAll() {
        return newsDetailService.findAll();
    }

    @Override
    public NewsDetailDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }




}
