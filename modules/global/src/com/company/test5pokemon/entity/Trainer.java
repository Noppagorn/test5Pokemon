package com.company.test5pokemon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "TEST5POKEMON_TRAINER")
@Entity(name = "test5pokemon_Trainer")
public class Trainer extends StandardEntity {
    private static final long serialVersionUID = -7125864741560833387L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "MONEY", nullable = false)
    protected BigDecimal money;

    public BigDecimal getMoney() { return money; }

    public void setMoney(BigDecimal money) { this.money = money; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}