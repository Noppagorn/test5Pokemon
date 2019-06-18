package com.company.test5pokemon.web.screens.trained;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trained;

@UiController("test5pokemon_Pokemon.edit")
@UiDescriptor("trained-edit.xml")
@EditedEntityContainer("trainedDc")
@LoadDataBeforeShow
public class TrainedEdit extends StandardEditor<Trained> {
}