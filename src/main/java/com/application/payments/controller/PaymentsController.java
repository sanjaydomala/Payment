package com.application.payments.controller;

import com.application.payments.data.Payments;
import com.application.payments.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentsController {

    @Autowired
    PaymentService paymentService;

    @GetMapping("/get-payments")
    public List<Payments> getPayments(){
        return paymentService.getPayments();
    }

    @PostMapping("/add-payments")
    public Payments addPaymentDetails(@RequestBody Payments payments){
        return paymentService.addPaymentDetails(payments);
    }


}
