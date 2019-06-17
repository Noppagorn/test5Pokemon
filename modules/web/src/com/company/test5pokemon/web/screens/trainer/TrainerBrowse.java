package com.company.test5pokemon.web.screens.trainer;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trainer;

@UiController("test5pokemon_Trainer.browse")
@UiDescriptor("trainer-browse.xml")
@LookupComponent("trainersTable")
@LoadDataBeforeShow
public class TrainerBrowse extends StandardLookup<Trainer> {

}