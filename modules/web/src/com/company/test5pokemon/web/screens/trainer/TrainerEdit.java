package com.company.test5pokemon.web.screens.trainer;

import com.company.test5pokemon.entity.Pokemon;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trainer;

import javax.inject.Inject;

@UiController("test5pokemon_Trainer.edit")
@UiDescriptor("trainer-edit.xml")
@EditedEntityContainer("trainerDc")

public class TrainerEdit extends StandardEditor<Trainer> {

    @Inject
    private InstanceContainer<Trainer> trainerDc;
    @Inject
    private CollectionLoader<Pokemon> pokemonsDl;
    @Inject
    private InstanceLoader<Trainer> trainerDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        trainerDl.load();
        pokemonsDl.setParameter("trainer",trainerDc.getItem());
        pokemonsDl.load();
    }



}