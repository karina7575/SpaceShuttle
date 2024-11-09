package com.javaacademy;

import com.javaacademy.details.Rocket;
import org.junit.jupiter.api.Test;

public class RocketTest {

    @Test
    public void Rocket () {
        Rocket rocket = new Rocket(1000, 2000, 300);
        if(rocket.getFirstStage() == null || rocket.getSecondStage() == null || rocket.getThirdStage() == null) {
            throw new RuntimeException("Ожидалось, что у ракеты создадутся 3 двигателя, а создалось меньше");
        }
    }
}
