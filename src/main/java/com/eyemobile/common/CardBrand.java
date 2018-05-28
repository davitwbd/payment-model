package com.eyemobile.common;

/**
 * Created by Davi Pereira on 10/10/2017.
 */
public enum CardBrand {
    //card names from API to mobile names
    GENERIC("generic"),
    VISA("visa"),
    MASTERCARD("mastercard"),
    JCB("jcb"),
    HIPERCARD("hipercard"),
    ELO("elo"),
    DISCOVER("discover"),
    DINERS("diners"),
    AURA("aura"),
    AMEX("amex"),
    SODEXO("sodexo"),
    ALELO("alelo"),
    TICKET("ticket"),
    APPLE_PAY("applePay"),
    PAYPAL("paypal");

    private String value;

    CardBrand(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static String getValue(String name){
        switch (name.toUpperCase()) {
            case "VISA":
                return VISA.getValue();
            case "VISA ELECTRON":
                return VISA.getValue();
            case "MC":
                return MASTERCARD.getValue();
            case "MASTERCARD":
                return MASTERCARD.getValue();
            case "MASTERCARD MAESTRO":
                return MASTERCARD.getValue();
            case "JCB":
                return JCB.getValue();
            case "HIPERCARD":
                return HIPERCARD.getValue();
            case "ELO":
                return ELO.getValue();
            case "DISCOVER":
                return DISCOVER.getValue();
            case "DINERS":
                return DINERS.getValue();
            case "AURA":
                return AURA.getValue();
            case "AMEX":
                return AMEX.getValue();
            case "SODEXO":
                return SODEXO.getValue();
            case "ALELO":
                return ALELO.getValue();
            case "TICKET":
                return TICKET.getValue();
            case "APPLE_PAY":
                return APPLE_PAY.getValue();
            case "PAYPAL":
                return PAYPAL.getValue();
            default:
                return GENERIC.getValue();
        }
    }
}
