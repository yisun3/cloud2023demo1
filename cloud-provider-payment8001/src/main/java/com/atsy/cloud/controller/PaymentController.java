package com.atsy.cloud.controller;

import com.atsy.cloud.entities.CommonResult;
import com.atsy.cloud.entities.Payment;
import com.atsy.cloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/creat")
    public CommonResult creatPayment(Payment payment){
        int result = paymentService.creatPayment(payment);
        log.info("****插入的结果："+result);
        if(result>0){
            System.out.println("***恭喜插入成功***");
            return new CommonResult(200,"插入数据成功，您插入的数据是："+payment,result);
        }else {
            System.out.println("sorry您插入的数据有误请重新尝试");
            return new CommonResult(500,"对不起，您插入的数据有误，请重新插入",null);
        }
    }

    @GetMapping(value = "/payment/getPayment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id){
        Payment payment =paymentService.getPaymentById(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功***",payment);
        }else {
            return new CommonResult(500,"查询失败，查询不到，您要查询的id是："+id,null);
        }
    }

}
