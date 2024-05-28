package edu.wgu.georgievl.d288.services;

import org.springframework.stereotype.Service;

@Service
public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
