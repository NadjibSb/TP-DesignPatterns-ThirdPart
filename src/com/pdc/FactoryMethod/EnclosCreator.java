package com.pdc.FactoryMethod;

import com.pdc.Enum.TypeEau;
import com.pdc.Enum.TypeSol;

public class EnclosCreator extends AbstractEnclosCreator {
    private static int id=0;

    @Override
    public Enclos creatEnclos(EnclosType type, int lng, int lrg, Enum typeSol_Eau, Double size) {
        Enclos enclos = null;
        double siz=0;
        if(size!=null){
            siz=size.doubleValue();
        }
        switch (type){
            case Cage:
                enclos = new Cage(++this.id,lng,lrg, (TypeSol) typeSol_Eau);
                break;

            case Aquarium:
                enclos = new Aquarium(++this.id,lng,lrg,siz,(TypeEau) typeSol_Eau);
                break;

            case Insectarium:
                enclos = new Insectarium(++this.id,lng,lrg);
                break;

            case Paludarium:
                enclos = new Paludarium(++this.id,lng,lrg,(TypeSol) typeSol_Eau,siz);
                break;

            case Voliere:
                enclos = new Voliere(++this.id,lng,lrg,siz);
                break;
        }
        return enclos;
    }
}
