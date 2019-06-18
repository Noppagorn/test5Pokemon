package com.company.test5pokemon.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "TEST5POKEMON_POKEMON")
@Entity(name = "test5pokemon_Pokemon")
public class Trained extends StandardEntity {
    private static final long serialVersionUID = -5896521531682707850L;


    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    protected BigDecimal amount;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRAINER_ID")
    protected Trainer trainer;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POKEMON_ID")
    protected Pokemon pokemon;

    @NotNull
    @Column(name = "LIFE_POINT", nullable = false)
    protected BigDecimal lifePoint;

    @NotNull
    @Column(name = "ATK", nullable = false)
    protected BigDecimal atk;

    @NotNull
    @Column(name = "DEF", nullable = false)
    protected BigDecimal def;

    public BigDecimal getDef() { return def; }

    public void setDef(BigDecimal def) { this.def = def; }

    public BigDecimal getAtk() { return atk; }

    public void setAtk(BigDecimal atk) { this.atk = atk; }

    public BigDecimal getLifePoint() { return lifePoint; }

    public void setLifePoint(BigDecimal lifePoint) { this.lifePoint = lifePoint; }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

}