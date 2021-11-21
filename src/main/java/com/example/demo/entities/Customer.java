package com.example.demo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private BigDecimal payment;

    public Customer(String name, String surname, int age, String email, BigDecimal payment) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.payment = payment;
    }
}
