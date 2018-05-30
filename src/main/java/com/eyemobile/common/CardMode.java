package com.eyemobile.common;

public enum CardMode {
    DEBIT(0),
    CREDIT(1);

    private final int id;

    CardMode(int id) {
        this.id = id; }

    public int getValue() {
        return id;
    }

    public static CardMode getEnum(int id){
        switch (id) {
            case 0:
                return DEBIT;
            case 1:
                return CREDIT;
            default:
                return CREDIT;
        }
    }
}
