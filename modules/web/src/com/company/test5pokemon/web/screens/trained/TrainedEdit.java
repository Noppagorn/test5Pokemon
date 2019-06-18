package com.company.test5pokemon.web.screens.trained;

import com.company.test5pokemon.entity.Pokemon;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.LookupPickerField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trained;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("test5pokemon_Pokemon.edit")
@UiDescriptor("trained-edit.xml")
@EditedEntityContainer("trainedDc")
@LoadDataBeforeShow
public class TrainedEdit extends StandardEditor<Trained> {

    @Inject
    private TextField<BigDecimal> lifePointField;
    @Inject
    private TextField<BigDecimal> atkField;
    @Inject
    private TextField<BigDecimal> defField;
    @Inject
    private CollectionContainer<Pokemon> pokemonsDc;
    @Inject
    private CollectionLoader<Pokemon> pokemonsLc;
    @Inject
    private LookupPickerField<Pokemon> pokemonField;

    protected void setValue(){
        try {
            for (Pokemon x : pokemonsDc.getItems()){
                if (x.getName().equals(pokemonField.getValue().getName())){
                    lifePointField.setValue(x.getLifePointDefault());
                    atkField.setValue(x.getAtkDefault());
                    defField.setValue(x.getDefDefault());
                }
            }
        }catch (NullPointerException e){
            lifePointField.setValue(new BigDecimal(0));
            atkField.setValue(new BigDecimal(0));
            defField.setValue(new BigDecimal(0));
        }

    }

    @Subscribe("pokemonField")
    private void onPokemonFieldValueChange(HasValue.ValueChangeEvent<Pokemon> event) {
        setValue();
    }




}