package com.eyemobile.payment;

import java.math.BigDecimal;

/**
 * Created by Davi Pereira on 29/05/2018
 *
 * <p/>
 * Description:<br>
 *  <strong>Split</strong>
 * <p/>
 *
 *  Attribute description:<br>
 *  <strong>recipientId</strong> It's the unique recipient reference in PaymentProvider.<br>
 *  <strong>amount</strong> It's a partial value of the transaction.<br>
 *  <strong>chargeProcessingFee</strong> It indicates who pays the fee for PaymentProvider.<br>
 *  <strong>liable</strong> It indicates who assumes the chargeback.<br>
 */
public class Split {

    private String recipientId;
    private BigDecimal amount;
    private boolean chargeProcessingFee;
    private boolean liable;

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public boolean isChargeProcessingFee() {
        return chargeProcessingFee;
    }

    public void setChargeProcessingFee(boolean chargeProcessingFee) {
        this.chargeProcessingFee = chargeProcessingFee;
    }

    public boolean isLiable() {
        return liable;
    }

    public void setLiable(boolean liable) {
        this.liable = liable;
    }
}
