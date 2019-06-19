package com.company.test5pokemon.web.screens.trainer;

import com.company.test5pokemon.entity.Trained;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.test5pokemon.entity.Trainer;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("test5pokemon_Trainer.edit")
@UiDescriptor("trainer-edit.xml")
@EditedEntityContainer("trainerDc")
public class TrainerEdit extends StandardEditor<Trainer> {

    @Inject
    private InstanceContainer<Trainer> trainerDc;
    @Inject
    private CollectionLoader<Trained> trainedsDl;
    @Inject
    private InstanceLoader<Trainer> trainerDl;

    @Inject
    private TextField<String> trainedsDcField;
    @Inject
    private CollectionContainer<Trained> trainedsDc;


    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        trainerDl.load();
        trainedsDl.setParameter("trainer",trainerDc.getItem());
        trainedsDl.load();

        BigDecimal bigDecimal = new BigDecimal(0);
        for (Trained x: trainedsDc.getItems()){
            if (x.getTrainer().getName().equals(trainerDc.getItem().getName())){
                bigDecimal = bigDecimal.add(x.getAmount());
            }
        }
        trainedsDcField.setValue(bigDecimal.toString());
    }


}