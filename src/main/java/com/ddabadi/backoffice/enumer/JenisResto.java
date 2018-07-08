package com.ddabadi.backoffice.enumer;

public enum JenisResto {
    NONRESTO(0),
    FOOD(1),
    DRINK(2),
    PACKAGE(3),
    DESSERT(4),
    NONFOOD(5);

    private final int jenisValue;

    JenisResto(int jenisValue) {
        this.jenisValue = jenisValue;
    }

    public int getJenisValue() {
        return jenisValue;
    }
}
