package kg.megacom.news_service.mappers;

import java.util.List;

public interface BaseMapper<S,T>{
    S toDto(T t);
    T toEntity(S s);
    List<S> toDtos(List<T> entities);
    List<T> toEntities(List<S> dtos);

}
