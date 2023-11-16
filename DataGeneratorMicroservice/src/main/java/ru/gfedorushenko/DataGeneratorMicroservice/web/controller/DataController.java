package ru.gfedorushenko.DataGeneratorMicroservice.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;
import ru.gfedorushenko.DataGeneratorMicroservice.model.test.DataTestOptions;
import ru.gfedorushenko.DataGeneratorMicroservice.service.KafkaDataService;
import ru.gfedorushenko.DataGeneratorMicroservice.service.TestDataService;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataDto;
import ru.gfedorushenko.DataGeneratorMicroservice.web.dto.DataTestOptionsDto;
import ru.gfedorushenko.DataGeneratorMicroservice.web.mapper.DataMapper;
import ru.gfedorushenko.DataGeneratorMicroservice.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor        //TODO ????
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;
    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dataDto) {
        Data data = dataMapper.toEntity(dataDto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);
    }

}
