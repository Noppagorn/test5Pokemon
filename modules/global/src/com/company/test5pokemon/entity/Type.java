package com.company.test5pokemon.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Table(name = "TEST5POKEMON_TYPE")
@Entity(name = "test5pokemon_Type")
public class Type extends StandardEntity {
    private static final long serialVersionUID = 4684940654815539636L;

    @NotNull
    @Column(name = "TYPE_NAME", nullable = false)
    protected String typeName;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}