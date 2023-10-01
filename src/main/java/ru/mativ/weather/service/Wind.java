package ru.mativ.weather.service;

public enum Wind {
    CALM(1f, "Штиль"),
    QUIET(4f, "Тихий"),
    BREEZE(10f, "Лекгий"),
    LIGHT(18f, "Слабый"),
    MODERATE(25f, "Умеренный"),
    FRESH(32f, "Свежий"),
    STRONG(54f, "Сильный"),
    VERY_STRONG(61f, "Очень сильный"),
    HURRICANE(999f, "Ураган");

    private Float speed;
    private String name;

    Wind(Float speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    public static String getName(Float speed) {
        Float last = 0f;
        for (Wind w : Wind.values()) {
            if (speed > last && speed <= w.speed) {
                return w.name;
            }
            last = w.speed;
        }
        return "Непонятный";
    }
}
