package com.company.test5pokemon.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "TEST5POKEMON_POKEMON")
@Entity(name = "test5pokemon_Pokemon")
public class Pokemon extends StandardEntity {
    private static final long serialVersionUID = -5896521531682707850L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TYPE_ID")
    protected Type type;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TRAINER_ID")
    protected Trainer trainer;

    @NotNull
    @Column(name = "LIFE_POINT", nullable = false)
    protected BigDecimal lifePoint;

    @NotNull
    @Column(name = "ATTACK_POINT", nullable = false)
    protected BigDecimal attackPoint;

    public BigDecimal getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(BigDecimal attackPoint) {
        this.attackPoint = attackPoint;
    }

    public BigDecimal getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(BigDecimal lifePoint) {
        this.lifePoint = lifePoint;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}