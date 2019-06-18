package com.company.test5pokemon.web.screens.type;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Type;

@UiController("test5pokemon_Type.edit")
@UiDescriptor("type-edit.xml")
@EditedEntityContainer("typeDc")
@LoadDataBeforeShow
public class TypeEdit extends StandardEditor<Type> {
}