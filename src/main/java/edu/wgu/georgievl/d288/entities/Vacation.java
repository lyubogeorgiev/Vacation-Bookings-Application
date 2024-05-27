package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vacationTitle;
    private String description;
    private BigDecimal travelPrice;
    private String imageUrl;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @OneToMany(mappedBy = "vacation")
    private Set<Excursion> excursions;

    public Vacation() {
    }
}
