package ru.gfedorushenko.DataGeneratorMicroservice.service;

import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;

public interface KafkaDataService {
    void send(Data data);
}
