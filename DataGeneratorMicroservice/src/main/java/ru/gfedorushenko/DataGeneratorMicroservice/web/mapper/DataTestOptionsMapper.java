package ru.gfedorushenko.DataGeneratorMicroservice.web.mapper;

import org.mapstruct.Mapper;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;
import ru.gfedorushenko.DataGeneratorMicroservice.model.test.DataTestOptions;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataDto;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {
}
