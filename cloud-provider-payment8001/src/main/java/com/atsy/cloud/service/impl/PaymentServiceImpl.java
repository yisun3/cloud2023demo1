package com.atsy.cloud.service.impl;

import com.atsy.cloud.dao.PaymentDao;
import com.atsy.cloud.entities.Payment;
import com.atsy.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int creatPayment(Payment payment) {
        return paymentDao.creatPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentByID(id);
    }
}
