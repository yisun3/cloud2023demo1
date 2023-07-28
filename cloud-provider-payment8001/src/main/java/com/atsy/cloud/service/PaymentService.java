package com.atsy.cloud.service;

import com.atsy.cloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int creatPayment(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
