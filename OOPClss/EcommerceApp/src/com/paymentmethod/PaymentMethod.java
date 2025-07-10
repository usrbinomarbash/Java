package com.paymentmethod;

import com.payment.Payment;

public enum PaymentMethod {
    CASH("Cash on delivery",0.00),
    CREDIT_CARD("Credit Card Payment",2.5),
    PAYPAL("Paypal Payment",3.0);

    private final String description;
    private final double processingFeePercentage;

    PaymentMethod(String description,double processingFeePercentage){
        this.description=description;
        this.processingFeePercentage=processingFeePercentage;
    }

    public String getDescription(){
        return description;
    }

    public double getProcessingFeePercentage(){
        return processingFeePercentage;
    }


    @Override
    public String toString() {
        return description +" (Fee: "+processingFeePercentage +"%)";
    }



}
