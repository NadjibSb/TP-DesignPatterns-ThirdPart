package com.pdc.FactoryMethod;

import java.awt.Color;
import java.util.Iterator;

import com.pdc.Animal;
import com.pdc.Enum.TypeSol;


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
        return "Cage : "+getId();
    }

}
