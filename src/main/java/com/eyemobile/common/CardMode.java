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

    public static int getValue(String name){
        switch (name.toUpperCase()) {
            case "DEBIT":
                return DEBIT.getValue();
            case "CREDIT":
                return CREDIT.getValue();
            default:
                return CREDIT.getValue();
        }
    }

    public static String getName(int id){
        switch (id) {
            case 0:
                return DEBIT.toString();
            case 1:
                return CREDIT.toString();
            default:
                return CREDIT.toString();
        }
    }
}
