package edu.wgu.georgievl.d288.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "customers")
//@AttributeOverride(name="id", column=@Column(name="customer_id"))
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "customer_first_name")
    @NotBlank(message = "First Name can't be blank")
    @Size(min = 3, max = 30, message = "First Name should be between 3 and 30 symbols")
    private String firstName;

    @Column(name = "customer_last_name")
    @NotBlank(message = "Last name can't be blank")
    @Size(min = 3, max = 30, message = "Last Name should be between 3 and 30 symbols")
    private String lastName;

    @NotBlank(message = "Address can't be blank")
    @Size(min = 5, max = 50, message = "Address should be between 5 and 50 symbols")
    private String address;

    @NotBlank(message = "Postal code can't be blank")
    @Size(min = 5, max = 5, message = "Postal code has to be 5 symbols long")
    private String postalCode;

    @NotBlank(message = "Phone Number can't be blank")
    private String phone;

    @CreationTimestamp
    private LocalDate createDate;

    @UpdateTimestamp
    private LocalDate lastUpdate;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Cart> carts;

    public Customer() {
    }
}
