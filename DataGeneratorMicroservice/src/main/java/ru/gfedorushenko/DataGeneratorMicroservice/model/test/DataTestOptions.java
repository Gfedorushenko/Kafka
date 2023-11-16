package ru.gfedorushenko.DataGeneratorMicroservice.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {
    private int delayInSeconds;
    private Data.MeasurementType[] measurementTypes;
}
