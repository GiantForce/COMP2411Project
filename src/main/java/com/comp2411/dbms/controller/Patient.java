package com.comp2411.dbms.controller;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String Patient_HKID;


    private String First_Name;
    private String Last_Name;
    private Double Weight;
    private Integer Height;
    private String Address;
    private Integer Phone;
    private Integer Birthday;
    private boolean  Recondition;
}
