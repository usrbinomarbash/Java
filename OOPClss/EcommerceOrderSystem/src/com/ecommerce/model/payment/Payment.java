
package com.ecommerce.model.payment;

import java.time.LocalDate;
import com.ecommerce.model.paymentMethod.PaymentMethod;



public class Payment{
    private int paymentId;
    private double amount;
    private LocalDate date;
    private PaymentMethod method;

    public Payment(int paymentId, double amount, LocalDate date, PaymentMethod method){
        this.paymentId=paymentId;
        this.amount=amount;
        this.date=date;
        this.method=method;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", amount=" + amount +
                ", date=" + date +
                ", method=" + method +
                '}';
    }

}