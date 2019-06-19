package com.company.test5pokemon.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "TEST5POKEMON_POKEMON_1")
@Entity(name = "test5pokemon_Pokemon_1")
public class Pokemon extends StandardEntity {
    private static final long serialVersionUID = -5896521531682707850L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ID")
    protected Type type;

    @NotNull
    @Column(name = "LIFE_POINT_DEFAULT", nullable = false)
    protected BigDecimal lifePointDefault;

    @NotNull
    @Column(name = "ATK_DEFAULT", nullable = false)
    protected BigDecimal atkDefault;

    @NotNull
    @Column(name = "DEF_DEFAULT", nullable = false)
    protected BigDecimal defDefault;

    public BigDecimal getDefDefault() {
        return defDefault;
    }

    public void setDefDefault(BigDecimal defDefault) {
        this.defDefault = defDefault;
    }

    public BigDecimal getAtkDefault() { return atkDefault; }

    public void setAtkDefault(BigDecimal atkDefault) { this.atkDefault = atkDefault; }

    public BigDecimal getLifePointDefault() { return lifePointDefault; }

    public void setLifePointDefault(BigDecimal lifePointDefault) { this.lifePointDefault = lifePointDefault; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}