package com.company.test5pokemon.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TRAIN_ID")
    protected Trainer train;

    public Trainer getTrain() {
        return train;
    }

    public void setTrain(Trainer train) {
        this.train = train;
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