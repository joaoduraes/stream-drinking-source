package com.joaoduraes.stream.drinking.source.service;

import com.joaoduraes.stream.drinking.source.domain.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;

@EnableBinding(Source.class)
@AllArgsConstructor
@Slf4j
public class Producer {

    private final Source source;
    private final PersonGenerator personGenerator;

    @Scheduled(fixedRate = 1000)
    private void spam() {
        Person person = personGenerator.generate();
        log.info(person.toString());
        source.output().send(MessageBuilder.withPayload(person).build());
    }
}
