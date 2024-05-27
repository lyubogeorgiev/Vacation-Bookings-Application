package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;
    @ManyToMany
    @JoinTable(
        name = "cartitem_excursion",
        joinColumns = @JoinColumn(name = "cartitem_id"),
        inverseJoinColumns = @JoinColumn(name = "excursion_id")
    )
    private Set<Excursion> excursions;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    public CartItem() {
    }
}
