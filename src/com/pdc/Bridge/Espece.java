package com.pdc.Bridge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import com.pdc.dependentClass.Enum.*;
import com.pdc.dependentClass.Photo;

public class Espece {
    private DataGetter dataGetter;
    private String nom;
    private String continents;
    private int dureeVie;
    private RegimeAlimentaire regime;
    private Habitat habitat;
    private Photo photo;
    private static int nbIndividus;

    public Espece(DataGetter dataGetter, EspeceType especeType) {
        this.dataGetter = dataGetter;

        this.nbIndividus++;
        this.nom = this.dataGetter.getName(especeType);
        this.continents = this.dataGetter.getContinents(especeType);
        this.dureeVie = this.dataGetter.getDureeVie(especeType);
        this.regime = this.dataGetter.gerRegime(especeType);
        this.habitat = this.dataGetter.getHabitat(especeType);

    }


    public Espece(String nom, String continents, int dureeVie, RegimeAlimentaire regime, Habitat habitat, Photo photo) {
        this.nbIndividus++;
        this.nom = nom;
        this.continents = continents;
        this.dureeVie = dureeVie;
        this.regime = regime;
        this.habitat = habitat;
        this.photo = photo;
    }

    public String getNom() {
        return this.nom;
    }

    public String getContinents() {
        return this.continents;
    }

    public int getDuree() {
        return this.dureeVie;
    }

    public RegimeAlimentaire getRegime() {
        return this.regime;
    }

    public Habitat getHabitat() {
        return this.habitat;
    }

    public int nbIndividus() {
        return this.nbIndividus();
    }


    public String toString() {
        return "\n" + this.nom + " : \n\tContinents : " + this.continents + "\n\tHabitat : " + this.habitat +
                "\n\tDurée de Vie :" + this.dureeVie + "\n\tRegime Alimentaire : "+ this.regime ;
    }

    public int comparer(Espece other) {

        return (this.nom).compareTo(other.getNom());
    }


    public int hashCode() {
        return this.nom.hashCode();
    }






}


