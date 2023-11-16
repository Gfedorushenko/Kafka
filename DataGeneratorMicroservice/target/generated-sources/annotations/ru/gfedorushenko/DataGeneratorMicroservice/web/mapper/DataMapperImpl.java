package ru.gfedorushenko.DataGeneratorMicroservice.web.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T21:00:48+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.18 (Amazon.com Inc.)"
)
@Component
public class DataMapperImpl implements DataMapper {

    @Override
    public Data toEntity(DataDto dto) {
        if ( dto == null ) {
            return null;
        }

        Data data = new Data();

        data.setSensorId( dto.getSensorId() );
        data.setTimeStamp( dto.getTimeStamp() );
        data.setMeasurement( dto.getMeasurement() );
        data.setMeasurementType( dto.getMeasurementType() );

        return data;
    }

    @Override
    public DataDto toDto(Data entity) {
        if ( entity == null ) {
            return null;
        }

        DataDto dataDto = new DataDto();

        dataDto.setSensorId( entity.getSensorId() );
        dataDto.setTimeStamp( entity.getTimeStamp() );
        dataDto.setMeasurement( entity.getMeasurement() );
        dataDto.setMeasurementType( entity.getMeasurementType() );

        return dataDto;
    }
}
