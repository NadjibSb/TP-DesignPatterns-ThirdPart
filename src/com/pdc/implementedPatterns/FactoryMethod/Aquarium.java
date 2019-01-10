package com.pdc.implementedPatterns.FactoryMethod;

import java.util.Iterator;

import com.pdc.implementedPatterns.dependentClass.Animal;
import com.pdc.implementedPatterns.dependentClass.Enum.Habitat;
import com.pdc.implementedPatterns.dependentClass.Enum.TypeEau;


public class Aquarium extends Enclos {

    public Aquarium(int id, double lng, double lrg, double contenance, TypeEau typeEau) {
        super(id, lng, lrg);
        this.contenance = contenance;
        this.typeEau = typeEau;
        // TODO Auto-generated constructor stub
    }

    private double contenance;
    private TypeEau typeEau;

    public boolean marche(Animal a) {
        boolean resultat = false;
        if (a.getEspece().getHabitat() == Habitat.eau) resultat = true;
        Iterator<Animal> it = animaux.iterator();
        while (it.hasNext()) {
            if (!a.marche(it.next())) resultat = false;
        }
        return resultat;
    }


    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Aquarium : -id: "+getId();
    }


}
