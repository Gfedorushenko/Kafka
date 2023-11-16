package ru.gfedorushenko.DataGeneratorMicroservice.web.mapper;

import java.util.Arrays;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;
import ru.gfedorushenko.DataGeneratorMicroservice.model.test.DataTestOptions;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataTestOptionsDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T21:00:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
@Component
public class DataTestOptionsMapperImpl implements DataTestOptionsMapper {

    @Override
    public DataTestOptions toEntity(DataTestOptionsDto dto) {
        if ( dto == null ) {
            return null;
        }

        DataTestOptions dataTestOptions = new DataTestOptions();

        dataTestOptions.setDelayInSeconds( dto.getDelayInSeconds() );
        Data.MeasurementType[] measurementTypes = dto.getMeasurementTypes();
        if ( measurementTypes != null ) {
            dataTestOptions.setMeasurementTypes( Arrays.copyOf( measurementTypes, measurementTypes.length ) );
        }

        return dataTestOptions;
    }

    @Override
    public DataTestOptionsDto toDto(DataTestOptions entity) {
        if ( entity == null ) {
            return null;
        }

        DataTestOptionsDto dataTestOptionsDto = new DataTestOptionsDto();

        dataTestOptionsDto.setDelayInSeconds( entity.getDelayInSeconds() );
        Data.MeasurementType[] measurementTypes = entity.getMeasurementTypes();
        if ( measurementTypes != null ) {
            dataTestOptionsDto.setMeasurementTypes( Arrays.copyOf( measurementTypes, measurementTypes.length ) );
        }

        return dataTestOptionsDto;
    }
}
