package ru.mativ.weather.service;

public enum Wind {
    CALM(1f),
    QUIET(4f),
    BREEZE(10f),
    LIGHT(18f),
    MODERATE(25f),
    FRESH(32f),
    STRONG(54f),
    VERY_STRONG(61f),
    HURRICANE(999f),
    UNKNOWN(1000f);

    private Float speed;

    Wind(Float speed) {
        this.speed = speed;
    }

    public Float getSpeed() {
        return speed;
    }

    public static Wind getBySpeed(Float speed) {
        Float last = 0f;
        for (Wind w : Wind.values()) {
            if (speed > last && speed <= w.speed) {
                return w;
            }
            last = w.speed;
        }
        return UNKNOWN;
    }
}
