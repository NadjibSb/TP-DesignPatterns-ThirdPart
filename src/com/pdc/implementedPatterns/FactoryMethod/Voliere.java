package com.pdc.implementedPatterns.FactoryMethod;

import java.util.Iterator;

import com.pdc.implementedPatterns.dependentClass.Animal;
import com.pdc.implementedPatterns.dependentClass.Enum.Barriere;


public class Voliere extends Enclos {

    public Voliere(int id, double lng, double lrg, double hauteur) {
        super(id, lng, lrg);
        this.barriere = Barriere.Fer;
        this.hauteur = hauteur;
        // TODO Auto-generated constructor stub
    }

    private double hauteur;
    private Barriere barriere;

    public boolean marche(Animal a) {
        boolean resultat = false;
        Iterator<Animal> it = animaux.iterator();
        while (it.hasNext()) {
            if (!a.marche(it.next())) resultat = false;
        }
        return resultat;
    }


    public String toString() {
        // TODO Auto-generated method stub
        return "Voliere id : "+getId();
    }

}
