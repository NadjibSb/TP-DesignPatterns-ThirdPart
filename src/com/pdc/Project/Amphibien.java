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



public class Amphibien extends Vertebre {

    private boolean venimeux;

    public Amphibien(String nom, String continents, int dureeVie,
                     RegimeAlimentaire regime, Habitat habitat, Photo photo, boolean venimeux) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        this.venimeux = venimeux;
    }

    public Amphibien(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
        this.venimeux= (dataGetter.getCharacteristic(especeType, AnimalCharac.venimeux) ==1);
    }



    public boolean getVenimeux() {
        return this.venimeux;
    }

}
