package com.eyemobile.payment;

import com.eyemobile.common.CardBrand;
import com.eyemobile.common.CardMode;
import com.eyemobile.common.PaymentProviderType;

import java.math.BigDecimal;

/**
 * Created by Tiago Felipe on 28/05/2018.
 */

public class PaymentTransaction {
    private String id;
    private String paymentReference;
    private CardBrand cardBrand;
    private CardMode cardMode;
    private PaymentProviderType provider;
    private String number;
    private String customerName;
    private BigDecimal total;
    private String metadata;
    private String time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public CardBrand getCardBrand() {
        return cardBrand;
    }

    public void setCardBrand(CardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public CardMode getCardMode() {
        return cardMode;
    }

    public void setCardMode(CardMode cardMode) {
        this.cardMode = cardMode;
    }

    public PaymentProviderType getProvider() {
        return provider;
    }

    public void setProvider(PaymentProviderType provider) {
        this.provider = provider;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
