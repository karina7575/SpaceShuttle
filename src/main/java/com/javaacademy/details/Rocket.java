package com.javaacademy.details;

/**
 * Ракета носитель
 */
public class Rocket {
    //Двигатель первой стадии
    private Engine firstStage;
    //Двигатель второй стадии
    private Engine secondStage;
    //Двигатель третьей стадии
    private Engine thirdStage;

    public Rocket(double fuelStageOne, double fuelStageTwo, double fuelStageThree) {
        this.firstStage = new Engine(fuelStageOne);
        this.secondStage = new Engine(fuelStageTwo);
    }

    /**
     * Запуск ракеты носителя
     */
    public void run() {
        firstStage.start();
        secondStage.start();
        thirdStage.start();
    }

    public Engine getFirstStage() {
        return firstStage;
    }

    public Engine getSecondStage() {
        return secondStage;
    }

    public Engine getThirdStage() {
        return thirdStage;
    }
}
