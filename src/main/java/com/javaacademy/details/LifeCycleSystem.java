package com.javaacademy.details;

import com.javaacademy.details.LifeCycleItems.JamTube;
import com.javaacademy.details.LifeCycleItems.OxygenBalloon;
import com.javaacademy.details.LifeCycleItems.Water;

/**
 * Система жизнеобеспечения
 */
public class LifeCycleSystem {
    //Вода
    private Water water;
    //Тюбик с едой
    private JamTube jamTube;
    //Кислород
    private OxygenBalloon oxygenBalloon;

    public LifeCycleSystem(Water water, JamTube jamTube, OxygenBalloon oxygenBalloon) {
        this.water = water;
        this.jamTube = jamTube;
        this.oxygenBalloon = oxygenBalloon;
    }

    public LifeCycleSystem(Water water, JamTube jamTube) {
        this.water = water;
        this.jamTube = jamTube;
    }

    public Water getWater() {
        return water;
    }

    public JamTube getJamTube() {
        return jamTube;
    }

    public OxygenBalloon getOxygenBalloon() {
        return oxygenBalloon;
    }
}
