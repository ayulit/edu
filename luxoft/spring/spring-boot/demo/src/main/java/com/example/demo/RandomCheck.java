package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by st10902 on 3/16/2018.
 */
@Component
public class RandomCheck implements HealthIndicator {
    @Override
    public Health health() {
        return new Random().nextBoolean() ? Health.up().build() : Health.down().build();
    }
}
