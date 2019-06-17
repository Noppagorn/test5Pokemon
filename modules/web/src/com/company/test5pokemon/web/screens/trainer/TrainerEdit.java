package com.company.test5pokemon.web.screens.trainer;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trainer;

@UiController("test5pokemon_Trainer.edit")
@UiDescriptor("trainer-edit.xml")
@EditedEntityContainer("trainerDc")
@LoadDataBeforeShow
public class TrainerEdit extends StandardEditor<Trainer> {
}