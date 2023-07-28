package com.atsy.cloud.dao;

import com.atsy.cloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

    public int creatPayment(Payment payment);

    public Payment getPaymentByID(@Param("id") Long id);
}
