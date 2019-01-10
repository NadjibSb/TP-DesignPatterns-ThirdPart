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


public class Reptile extends Vertebre {

    public Reptile(String nom, String continents, int dureeVie,
                   RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        // TODO Auto-generated constructor stub
    }

    public Reptile(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
        this.dangereux= (dataGetter.getCharacteristic(especeType, AnimalCharac.dangereux)==1);
    }

    private boolean dangereux;

    public boolean getDangereux() {
        return this.dangereux;
    }


}
