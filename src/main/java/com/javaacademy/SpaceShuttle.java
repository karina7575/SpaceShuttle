package com.javaacademy;

import com.javaacademy.details.Rocket;
import com.javaacademy.details.Capsule;

/**
 * Космический корабль
 */
public class SpaceShuttle {
    //Имя корабля
    private final String name;
    //Ракета носитель
    private final Rocket rocket;
    //Космический аппарат
    private final Capsule capsule;

    public SpaceShuttle(String name, Rocket rocket, Capsule capsule) {
        this.name = name;
        this.rocket = rocket;
        this.capsule = capsule;
    }

    /**
     * Посадка космонавта на борт
     */
    public void setCosmonaut(Cosmonaut cosmonaut) {
        capsule.setCosmonaut(cosmonaut);
    }

    /**
     * Запуск шаттла
     */
    public void run() {
        capsule.getCosmonaut().phrase();
    }

    public Rocket getRocket() {
        return rocket;
    }

    public Capsule getSpacecraft() {
        return capsule;
    }

    public String getName() {
        return name;
    }
}
