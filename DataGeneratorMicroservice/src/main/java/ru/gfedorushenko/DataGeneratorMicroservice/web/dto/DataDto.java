package ru.gfedorushenko.DataGeneratorMicroservice.web.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class DataDto {
    private Long sensorId;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss") //TODO Проблема с форматом времени
    private LocalDateTime timeStamp;
    private double measurement;
    private Data.MeasurementType measurementType;
}
