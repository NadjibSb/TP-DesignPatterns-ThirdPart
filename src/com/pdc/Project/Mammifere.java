package com.pdc.Project;

import com.pdc.Project.Bridge.AnimalCharac;
import com.pdc.Project.Bridge.Animals;
import com.pdc.Project.Bridge.DataGetter;
import com.pdc.Project.Enum.Habitat;
import com.pdc.Project.Enum.RegimeAlimentaire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Mammifere extends Vertebre {

    public Mammifere(String nom, String continents, int dureeVie,
                     RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        // TODO Auto-generated constructor stub
    }

    public Mammifere(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
        this.duree_gestation= dataGetter.getCharacteristic(especeType, AnimalCharac.duree_gestation);
    }

    private int duree_gestation;

    public int getGestation() {
        return this.duree_gestation;
    }


}
