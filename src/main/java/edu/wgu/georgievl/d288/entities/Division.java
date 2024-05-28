package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "divisions")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long divisionId;

    @Column(name = "division")
    private String divisionName;

    @CreationTimestamp
    private LocalDate createDate;

    @UpdateTimestamp
    private LocalDate lastUpdate;

    @Setter
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

//    private Long countryId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "division")
    private Set<Customer> customers;

    public Division() {
    }

}
