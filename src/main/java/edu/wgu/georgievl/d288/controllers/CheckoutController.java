package edu.wgu.georgievl.d288.controllers;

import edu.wgu.georgievl.d288.services.CheckoutService;
import edu.wgu.georgievl.d288.services.Purchase;
import edu.wgu.georgievl.d288.services.PurchaseResponse;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }
}
