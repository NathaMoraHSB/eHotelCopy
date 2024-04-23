package com.example.application.Common;

public enum Events {

    LOGIN_FAILED("Login wasn't successful"),
    CUSTOMER_RE_REGISTERED("A customer has re- registered"),
    ROOM_DELETED_BY_MANAGER("The hotel management deletes a room"),
    CHECK_IN("An employee carries out a check-in"),
    CHECK_OUT("An employee carries out a check-out");


    private final String description;

    Events(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Events{" +
                "description='" + description + '\'' +
                '}';
    }
}
