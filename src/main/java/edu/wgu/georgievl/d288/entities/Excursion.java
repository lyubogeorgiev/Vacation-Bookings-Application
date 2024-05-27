package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Excursion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String excursionTitle;
    private BigDecimal excursionPrice;
    private String imageUrl;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "excursion_id")
    private Vacation vacation;

    @ManyToMany(mappedBy = "excursions")
    private Set<CartItem> cartItems;

    public Excursion() {
    }
}
