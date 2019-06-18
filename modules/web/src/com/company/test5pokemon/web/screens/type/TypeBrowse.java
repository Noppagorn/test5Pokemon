package com.company.test5pokemon.web.screens.type;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Type;

@UiController("test5pokemon_Type.browse")
@UiDescriptor("type-browse.xml")
@LookupComponent("typesTable")
@LoadDataBeforeShow
public class TypeBrowse extends StandardLookup<Type> {
}