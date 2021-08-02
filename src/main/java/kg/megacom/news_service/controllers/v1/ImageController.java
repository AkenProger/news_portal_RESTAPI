package kg.megacom.news_service.controllers.v1;

import kg.megacom.news_service.controllers.BaseController;
import kg.megacom.news_service.models.dto.ImagesDto;
import kg.megacom.news_service.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/images")
public class ImageController implements BaseController<ImagesDto, Long> {

    @Autowired
    ImageService imageService;
    @Override
    public ImagesDto save(ImagesDto S) {
        return imageService.save(S);
    }

    @Override
    public ImagesDto update(ImagesDto imagesDto) {
        return null;
    }

    @Override
    public List<ImagesDto> findAll() {
        return imageService.findAll();
    }

    @Override
    public ImagesDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
