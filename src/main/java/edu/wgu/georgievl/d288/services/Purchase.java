package edu.wgu.georgievl.d288.services;

import edu.wgu.georgievl.d288.entities.Cart;
import edu.wgu.georgievl.d288.entities.CartItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Cart cart;
    private Set<CartItem> cartItems;
}
