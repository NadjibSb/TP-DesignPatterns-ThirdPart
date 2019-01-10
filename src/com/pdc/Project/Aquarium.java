package com.pdc.Project;

import com.pdc.Project.Enum.Habitat;
import com.pdc.Project.Enum.TypeEau;

import java.awt.*;
import java.util.Iterator;


public class Aquarium extends Enclos {

    public Aquarium(int id, double lng, double lrg, int max, double contenance, TypeEau typeEau) {
        super(id, lng, lrg, max);
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
    public void colorier() {
        PlanZoo.cases.get(this.getAdr()).setBackground(Color.BLUE);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Aquarium" + String.valueOf(identifiant);
    }


}
