package com.company.test5pokemon.web.screens.pokemon;

import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Pokemon;

@UiController("test5pokemon_Pokemon_1.browse")
@UiDescriptor("pokemon-browse.xml")
@LookupComponent("pokemonsTable")
@LoadDataBeforeShow
public class PokemonBrowse extends StandardLookup<Pokemon> {
}