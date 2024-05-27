package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "countries")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long countryId;

    @Column(name = "country")
    private String countryName;
    private LocalDate createDate;
    private LocalDate lastUpdate;

    @OneToMany(mappedBy = "country")
    private Set<Division> divisions;

    public Country() {
    }
}
