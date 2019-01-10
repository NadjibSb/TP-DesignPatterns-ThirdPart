package com.pdc.Project;

import com.pdc.Project.Bridge.Animals;
import com.pdc.Project.Bridge.DataGetter;
import com.pdc.Project.Enum.Habitat;
import com.pdc.Project.Enum.RegimeAlimentaire;


public abstract class Invertebre extends Espece {

    public Invertebre(String nom, String continents, int dureeVie,
                      RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        // TODO Auto-generated constructor stub
    }

    public Invertebre(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
    }

}
