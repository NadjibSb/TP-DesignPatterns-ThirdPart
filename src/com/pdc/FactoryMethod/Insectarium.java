package com.pdc.FactoryMethod;

import java.util.Iterator;

import com.pdc.dependentClass.Animal;
import com.pdc.dependentClass.Enum.Barriere;


public class Insectarium extends Enclos {

    private Barriere barriere;

    public Insectarium(int id, double lng, double lrg) {
        super(id, lng, lrg);
        this.barriere = Barriere.Verre;
    }


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
        return "Insectarium id : " +getId();
    }
}
