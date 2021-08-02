package kg.megacom.news_service.services.impl;

import kg.megacom.news_service.dao.ImageRepository;
import kg.megacom.news_service.mappers.ImageMapper;
import kg.megacom.news_service.models.dto.ImagesDto;
import kg.megacom.news_service.models.entity.Images;
import kg.megacom.news_service.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    ImageRepository imageRepository;

    @Autowired
    ImageMapper imageMapper;

    @Override
    public ImagesDto save(ImagesDto imagesDto) {
        Images images = imageMapper.toEntity(imagesDto);
        images = imageRepository.save(images);
        return imageMapper.toDto(images);
    }

    @Override
    public ImagesDto update(ImagesDto imagesDto) {
        return null;
    }

    @Override
    public List<ImagesDto> findAll() {
        return imageMapper.toDtos(imageRepository.findAll());
    }

    @Override
    public ImagesDto findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
