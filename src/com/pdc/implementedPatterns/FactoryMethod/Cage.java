package com.pdc.implementedPatterns.FactoryMethod;

import com.pdc.implementedPatterns.dependentClass.Animal;
import com.pdc.implementedPatterns.dependentClass.Enum.TypeSol;


public class Cage extends Enclos {

    private TypeSol typeSol;

    public Cage(int id, double lng, double lrg, TypeSol typesol) {
        super(id, lng, lrg);
        this.typeSol = typesol;
        // TODO Auto-generated constructor stub
    }


    public boolean marche(Animal a) {

        return true;
    }

    public void colorier() {
    }

    @Override
    public String toString() {
        return "Cage id : "+getId();
    }

}
