package com.javaacademy;

import com.javaacademy.details.Rocket;
import com.javaacademy.exceptions.LimitFuelException;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

public class RocketTest {

    @Test
    @SneakyThrows
    public void createRocket() {
        Rocket rocket = new Rocket(65_000, 78_000, 99_000);
        if(rocket.getFirstStage() == null || rocket.getSecondStage() == null || rocket.getThirdStage() == null) {
            throw new RuntimeException("Ожидалось, что у ракеты создадутся 3 двигателя, а создалось меньше");
        }
    }
}
