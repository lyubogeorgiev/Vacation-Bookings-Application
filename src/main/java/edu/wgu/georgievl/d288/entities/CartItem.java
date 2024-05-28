package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "vacation_id")
    private Vacation vacation;
    @ManyToMany
    @JoinTable(
        name = "excursion_cartitem",
        joinColumns = @JoinColumn(name = "excursion_id"),
        inverseJoinColumns = @JoinColumn(name = "cart_item_id")
    )
    private Set<Excursion> excursions;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @CreationTimestamp
    private LocalDate create_date;

    @UpdateTimestamp
    private LocalDate last_update;

    public CartItem() {
    }
}
