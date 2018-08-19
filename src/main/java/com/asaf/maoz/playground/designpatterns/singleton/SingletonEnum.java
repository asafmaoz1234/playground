package com.asaf.maoz.playground.designpatterns.singleton;

public enum SingletonEnum {
    SINGLETON_ENUM("value_one", "value_two");

    private String valOne;
    private String valTwo;
    SingletonEnum(String value_one, String value_two) {
    }

    public String getValOne() {
        return valOne;
    }

    public String getValTwo() {
        return valTwo;
    }
}
