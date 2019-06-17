package com.company.test5pokemon.web.screens.pokemon;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Pokemon;

@UiController("test5pokemon_Pokemon.edit")
@UiDescriptor("pokemon-edit.xml")
@EditedEntityContainer("pokemonDc")
@LoadDataBeforeShow
public class PokemonEdit extends StandardEditor<Pokemon> {
}