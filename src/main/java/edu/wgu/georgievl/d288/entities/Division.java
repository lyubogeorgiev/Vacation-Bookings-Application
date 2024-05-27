package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String divisionName;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @Setter
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private Long countryID;

    @OneToMany(mappedBy = "division")
    private Set<Customer> customers;

    public Division() {
    }

}
