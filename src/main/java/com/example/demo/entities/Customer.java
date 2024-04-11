package com.example.demo.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id;

    @NonNull
    @NotBlank(message = "First Name is needed")
    @Column(name = "customer_first_name")
    private String firstName;

    @NonNull
    @NotBlank(message = "Last Name is needed")
    @Column(name = "customer_last_name")
    private String lastName;

    @NonNull
    @NotBlank(message = "Address is needed")
    @Column(name = "address")
    private String address;

    @NonNull
    @NotBlank(message = "Postal Code is needed")
    @Column(name = "postal_code")
    private String postal_code;

    @NonNull
    @NotBlank(message = "Phone Number is needed")
    @Column(name = "phone")
    private String phone;

    @Column(name = "create_date")
    @CreationTimestamp
    private Date create_date;

    @Column(name = "last_update")
    @UpdateTimestamp
    private Date last_update;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Cart> carts;



}
