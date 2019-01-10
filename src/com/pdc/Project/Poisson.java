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


public class Poisson extends Vertebre {

    public Poisson(String nom, String continents, int dureeVie,
                   RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        // TODO Auto-generated constructor stub
    }

    public Poisson(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
        this.typeEau= (dataGetter.getCharacteristic(especeType, AnimalCharac.typeEau)==1);
    }

    private double longueur;
    private boolean typeEau;

    public boolean getTypeEau() {
        return this.typeEau;
    }
}
