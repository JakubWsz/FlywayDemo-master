package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendor {
    @Id
    private Long id;
    private String companyName;
}
