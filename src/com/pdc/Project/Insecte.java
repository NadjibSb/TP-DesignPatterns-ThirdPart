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


public class Insecte extends Invertebre {

    public Insecte(String nom, String continents, int dureeVie,
                   RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        super(nom, continents, dureeVie, regime, habitat, photo);
        // TODO Auto-generated constructor stub
    }

    public Insecte(DataGetter dataGetter, Animals especeType) {
        super(dataGetter,especeType);
        this.nb_pattes= dataGetter.getCharacteristic(especeType, AnimalCharac.nb_pattes);
    }

    private int nb_pattes;

    public int getPattes() {
        return this.nb_pattes;
    }
}
