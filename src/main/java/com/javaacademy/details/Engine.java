package com.javaacademy.details;

import com.javaacademy.exceptions.LimitFuelException;

/**
 * Двигатель космического корабля
 */
public class Engine {
    //Минимальное количество топливо для старта
    private static final double MINIMUM_FUEL_FOR_START = 60_000;
    //Максимальное количество топлива внутри двигателя
    private static final double MAX_FUEL = 100_000;
    //Текущее количество топлива в двигателе
    private double currentFuel;

    public Engine(double currentFuel) throws LimitFuelException {
        if (currentFuel > MAX_FUEL) {
            throw new LimitFuelException();
        } else {
            this.currentFuel = currentFuel;
        }
    }

    /**
     * Запуск двигателя
     */
    public void start() {
        currentFuel = 0;
    }


    /**
     * Дозаправка
     */
    public void refuel(double currentFuel) throws LimitFuelException {
        if (this.currentFuel + currentFuel > MAX_FUEL) {
            throw new LimitFuelException();
        } else {
            this.currentFuel += currentFuel;
        }
    }
}
