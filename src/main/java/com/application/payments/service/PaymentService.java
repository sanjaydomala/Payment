package com.application.payments.service;

import com.application.payments.data.Payments;
import com.application.payments.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

    public Payments addPaymentDetails(Payments payments){
        return paymentRepository.save(payments);
    }

    public List<Payments> getPayments() {
        return paymentRepository.findAll();
    }
}
