package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Customer {
    @Id
    private long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private BigDecimal payment;
}
