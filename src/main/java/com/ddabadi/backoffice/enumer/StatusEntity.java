package com.ddabadi.backoffice.enumer;

public enum StatusEntity {
    NONACTIVE(false),
    ACTIVE(true);

    private final boolean entityValue;

    StatusEntity(boolean entityValue) {
        this.entityValue = entityValue;
    }

    public boolean getEntityValue() {
        return entityValue;
    }
}
