package com.company.test5pokemon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "TEST5POKEMON_TRAINER")
@Entity(name = "test5pokemon_Trainer")
public class Trainer extends StandardEntity {
    private static final long serialVersionUID = -7125864741560833387L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "AMOUNT")
    protected Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}