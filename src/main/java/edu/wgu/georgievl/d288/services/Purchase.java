package edu.wgu.georgievl.d288.services;

import edu.wgu.georgievl.d288.entities.Cart;
import edu.wgu.georgievl.d288.entities.CartItem;
import edu.wgu.georgievl.d288.entities.Customer;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Purchase {
    private Cart cart;
    private Set<CartItem> cartItems;
    private Customer customer;
}
