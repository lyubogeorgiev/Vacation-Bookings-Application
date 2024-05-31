package edu.wgu.georgievl.d288.services;

import edu.wgu.georgievl.d288.dao.CartRepository;
import edu.wgu.georgievl.d288.dao.CustomerRepository;
import edu.wgu.georgievl.d288.entities.Cart;
import edu.wgu.georgievl.d288.entities.CartItem;
import edu.wgu.georgievl.d288.entities.Customer;
import edu.wgu.georgievl.d288.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    private final CartRepository cartRepository;

    public CheckoutServiceImpl(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        Cart cart = purchase.getCart();

        System.out.println(purchase.getCart().getId());
        System.out.println(purchase.getCart().getStatus());
        System.out.println(purchase.getCart().getCustomer().getFirstName());
        System.out.println(purchase.toString());

        purchase.getCart().setStatus(StatusType.ordered);

        System.out.println(purchase.getCart().getStatus());

        System.out.println(purchase.getCartItems().size());
        System.out.println(purchase.getCartItems());
        purchase.getCartItems().forEach(item -> System.out.println(item.getExcursions().size()));

        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        System.out.println(orderTrackingNumber);

        Set<CartItem> cartItems = purchase.getCartItems();

        cartItems.forEach(item -> {
            cart.add(item);
            item.setCart(cart);
            item.getExcursions().forEach(excursion -> {
                excursion.setVacation(item.getVacation());
                excursion.getCartItems().add(item);
            });
        });

        cartRepository.save(cart);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
