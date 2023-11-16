package ru.gfedorushenko.DataGeneratorMicroservice.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {
    private int delayInSeconds; //TODO Должны быть секунды
    private Data.MeasurementType[] measurementTypes;
}
