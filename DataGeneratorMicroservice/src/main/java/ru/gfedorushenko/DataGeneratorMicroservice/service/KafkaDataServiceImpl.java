package ru.gfedorushenko.DataGeneratorMicroservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.kafka.sender.KafkaSender;
import reactor.kafka.sender.SenderRecord;
import ru.gfedorushenko.DataGeneratorMicroservice.model.Data;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService {
    private final KafkaSender<String, Object> sender;

    @Override
    public void send(Data data) {
        String topic = "";
        switch (data.getMeasurementType()) {
            case TEMPERATURE: topic="data-temperature"; break;
            case VOLTAGE: topic="data-voltage"; break;
            case POWER: topic="data-power"; break;
        };
        sender.send(
                        Mono.just(
                                SenderRecord.create(
                                        topic,
                                        0,
                                        System.currentTimeMillis(),
                                        String.valueOf(data.hashCode()),
                                        data,
                                        null
                                )
                        )
                )
                .subscribe();
    }
}
