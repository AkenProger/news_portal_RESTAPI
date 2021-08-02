package kg.megacom.news_service.mappers.impl;

import kg.megacom.news_service.mappers.ImageMapper;
import kg.megacom.news_service.models.dto.ImagesDto;
import kg.megacom.news_service.models.entity.Images;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class ImageMapperImpl implements ImageMapper {
    @Override
    public ImagesDto toDto(Images images) {
        ImagesDto imagesDto = new ImagesDto();
        imagesDto.setId(images.getId());
        imagesDto.setImgUrl(images.getImgUrl());
        imagesDto.setOrder_num(images.getOrder_num());
        imagesDto.setActive(images.isActive());
        imagesDto.setNewsDetails_id(images.getNewsDetails_id());
        return imagesDto;
    }

    @Override
    public Images toEntity(ImagesDto imagesDto) {
        Images images= new Images();
        images.setId(imagesDto.getId());
        images.setImgUrl(imagesDto.getImgUrl());
        images.setOrder_num(imagesDto.getOrder_num());
        images.setActive(imagesDto.isActive());
        images.setNewsDetails_id(imagesDto.getNewsDetails_id());
        return images;
    }

    @Override
    public List<ImagesDto> toDtos(List<Images> entities) {
        return entities.stream()
                .map(s-> toDto(s))
                .collect(Collectors.toList());
    }

    @Override
    public List<Images> toEntities(List<ImagesDto> dtos) {
        return dtos.stream()
                .map(s->toEntity(s))
                .collect(Collectors.toList());
    }
}
