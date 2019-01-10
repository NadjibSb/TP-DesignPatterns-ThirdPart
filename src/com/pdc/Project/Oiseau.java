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


public class Oiseau extends Vertebre {

    public Oiseau(String nom, String continents, int dureeVie,
                  RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        // TODO Auto-generated constructor stub
    }

    public Oiseau(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
        this.volant= (dataGetter.getCharacteristic(especeType, AnimalCharac.volant)==1);
    }

    private boolean volant;

    public boolean getVolant() {
        return this.volant;
    }

}
