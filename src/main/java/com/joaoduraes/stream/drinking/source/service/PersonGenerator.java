package com.joaoduraes.stream.drinking.source.service;

import com.joaoduraes.stream.drinking.source.domain.Person;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Random;
import java.util.UUID;

@Component
public class PersonGenerator {

    private final String[] firstNames = "Theresa, Donald, Angela, Emmanuel".split(", ");
    private final String[] lastNames = "May, Trump, Merkel, Macrons".split(", ");

    private final Random rnd = new Random();
    private int i = 0, j = 0;

    public Person generate() {
        i = rnd.nextInt(4);
        j = rnd.nextInt(4);

        return new Person(UUID.randomUUID().toString(), firstNames[i], lastNames[j], Instant.now());
    }
}
