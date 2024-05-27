package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderTrackingNumber;
    private BigDecimal packagePrice;
    private int partySize;
    private StatusType status;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Customer customer;

    @OneToMany(mappedBy = "cart")
    private Set<CartItem> cartItems;

    public Cart() {
    }
}
