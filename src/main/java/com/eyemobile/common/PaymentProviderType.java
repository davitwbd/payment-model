package com.eyemobile.common;

public enum PaymentProviderType {
    PAGARME(0),
    ZOOP(1),
    ADYEN(2),
    MUNDIPAGG(3),
    STONE(4),
    PAGNET(5);

    private final int id;

    PaymentProviderType(int id) {
        this.id = id;
    }

    public int getValue() {
        return id;
    }

}
