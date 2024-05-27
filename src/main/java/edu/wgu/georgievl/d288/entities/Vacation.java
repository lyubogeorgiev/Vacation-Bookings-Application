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
@Table(name = "vacations")
public class Vacation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vacation_id")
    private Long id;

    private String vacationTitle;
    private String description;

    @Column(name = "travel_fare_price")
    private BigDecimal travelPrice;
    private String imageUrl;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @OneToMany(mappedBy = "vacation")
    private Set<Excursion> excursions;

    public Vacation() {
    }
}
