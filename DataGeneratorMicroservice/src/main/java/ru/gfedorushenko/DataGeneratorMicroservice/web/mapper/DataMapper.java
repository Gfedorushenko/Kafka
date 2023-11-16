package ru.gfedorushenko.DataGeneratorMicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataDto;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {
}
