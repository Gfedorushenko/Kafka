package ru.gfedorushenko.DataGeneratorMicroservice.service;

import ru.gfedorushenko.DataGeneratorMicroservice.model.test.DataTestOptions;

public interface TestDataService {
    void sendMessages(DataTestOptions testOptions);
}
