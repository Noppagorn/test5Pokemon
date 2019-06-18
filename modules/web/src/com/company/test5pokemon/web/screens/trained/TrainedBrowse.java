package com.company.test5pokemon.web.screens.trained;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trained;

@UiController("test5pokemon_Pokemon.browse")
@UiDescriptor("trained-browse.xml")
@LookupComponent("trainedsTable")
@LoadDataBeforeShow
public class TrainedBrowse extends StandardLookup<Trained> {
}