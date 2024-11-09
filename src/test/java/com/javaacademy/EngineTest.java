package com.javaacademy;

import com.javaacademy.details.Engine;
import com.javaacademy.exceptions.LimitFuelException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EngineTest {

    @Test
    public void createEngine() {
        Assertions.assertThrows(LimitFuelException.class, () -> new Engine(200_000));
    }

    @Test
    @SneakyThrows
    public void refuel() {
        Engine engine = new Engine(99_000);
        Assertions.assertThrows(LimitFuelException.class, () -> engine.refuel(10_000));
    }
}
