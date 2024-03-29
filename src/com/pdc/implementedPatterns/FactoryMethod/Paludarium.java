package com.pdc.implementedPatterns.FactoryMethod;

import java.util.Iterator;

import com.pdc.implementedPatterns.dependentClass.Animal;
import com.pdc.implementedPatterns.dependentClass.Enum.Habitat;
import com.pdc.implementedPatterns.dependentClass.Enum.TypeSol;


public class Paludarium extends Enclos {

    public Paludarium(int id, double lng, double lrg, TypeSol type, double sur) {
        super(id, lng, lrg);
        this.typeSol = type;
        this.surface_eau = sur;
    }

    private TypeSol typeSol;
    private double surface_eau;

    public boolean marche(Animal a) {
        boolean resultat = false;
        if (a.getEspece().getHabitat() == Habitat.terre_eau) resultat = true;
        Iterator<Animal> it = animaux.iterator();
        while (it.hasNext()) {
            if (!a.marche(it.next())) resultat = false;
        }
        return resultat;
    }


    public String toString() {
        // TODO Auto-generated method stub
        return "Paludatium id: "+getId();
    }
}
