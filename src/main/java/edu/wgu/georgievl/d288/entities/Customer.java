package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String postalCode;
    private String phone;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Division division;

    @OneToMany(mappedBy = "customer")
    private Set<Cart> carts;

    public Customer() {
    }
}
