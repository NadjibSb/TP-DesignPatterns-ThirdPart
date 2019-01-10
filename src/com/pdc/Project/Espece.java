package com.pdc.Project;

import com.pdc.Project.Bridge.Animals;
import com.pdc.Project.Bridge.DataGetter;
import com.pdc.Project.Enum.Habitat;
import com.pdc.Project.Enum.RegimeAlimentaire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.StringTokenizer;

public class Espece {
    private String nom;
    private String continents;
    private int dureeVie;
    private RegimeAlimentaire regime;
    private Habitat habitat;
    private Photo photo;
    private static int nbIndividus;
    private DataGetter dataGetter;

    public Espece(DataGetter dataGetter, Animals especeType) {
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

    public Set<Enclos> enclosResidants() {
        return null;
    }

    public String toString() {
        return "\n" + this.nom + " : \n\tContinents : " + this.continents + "\n\tHabitat : " + this.habitat +
                "\n\tDurée de Vie :" + this.dureeVie + "\n\tRegime Alimentaire : "+ this.regime ;
    }
    public int comparer(Espece other) {

        return (this.nom).compareTo(other.getNom());
    }

    public boolean eg(Object ob) {
        return this.hashCode() == ob.hashCode();
    }

    public int hashCode() {
        return this.nom.hashCode();
    }

    public String Continents(String s) {
        StringTokenizer tok = new StringTokenizer(s, ",");
        String resultat = "";
        int nb = tok.countTokens();
        for (int i = 0; i < nb; i++) {
            String cont = tok.nextToken();
            switch (cont) {
                case "0":
                    resultat = resultat + "Afrique ";
                    break;
                case "1":
                    resultat = resultat + "Europe ";
                    break;
                case "2":
                    resultat = resultat + "Antartique ";
                    break;
                case "3":
                    resultat = resultat + "Asie ";
                    break;
                case "4":
                    resultat = resultat + "Amerique ";
                    break;
                case "5":
                    resultat = resultat + "Oceanie ";
                    break;

            }
        }
        return resultat;
    }

    public Habitat Habitat(String s) {
        Habitat resultat = null;
        switch (s) {
            case "0":
                resultat = Habitat.eau;
                break;
            case "1":
                resultat = Habitat.terre;
                break;
            case "2":
                resultat = Habitat.air;
                break;
            case "1,0":
                resultat = Habitat.terre_eau;
                break;
            case "0,1":
                resultat = Habitat.terre_eau;
                break;
        }
        return resultat;
    }

    private RegimeAlimentaire MakeRegime(String s) {
        RegimeAlimentaire resultat = null;
        switch (s) {
            case "0":
                resultat = RegimeAlimentaire.Carnivore;
                break;
            case "1":
                resultat = RegimeAlimentaire.Herbivore;
                break;
            case "2":
                resultat = RegimeAlimentaire.Omnivore;
                break;
        }
        return resultat;
    }

}


