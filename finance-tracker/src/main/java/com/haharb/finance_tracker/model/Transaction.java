package com.haharb.finance_tracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Double amount;
    private String type; // Income or expense
    private int frequency;

    // Getters and Setters

    public Long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    public Double getAmount() {
        return this.amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }


    public int getFrequency() {
        return this.frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
