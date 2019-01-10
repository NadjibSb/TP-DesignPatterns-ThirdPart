package com.pdc.Project.FactoryMethod;

import com.pdc.Project.*;
import com.pdc.Project.Enum.*;

public class EnclosCreator extends AbstractEnclosCreator {
    private static int id=0;

    @Override
    public Enclos creatEnclos(EnclosType type, double lng, double lrg, Enum typeSol_Eau, double size) {
        Enclos enclos = null;
        double siz=0;
        int max=0;

        switch (type){
            case Cage:
                enclos = new Cage(++this.id,lng,lrg,max, (TypeSol) typeSol_Eau);
                break;

            case Aquarium:
                enclos = new Aquarium(++this.id,lng,lrg,max,siz,(TypeEau) typeSol_Eau);
                break;

            case Insectarium:
                enclos = new Insectarium(++this.id,lng,lrg,max);
                break;

            case Paludarium:
                enclos = new Paludarium(++this.id,lng,lrg,max,(TypeSol) typeSol_Eau,siz);
                break;

            case Voliere:
                enclos = new Voliere(++this.id,lng,lrg,max,siz);
                break;
        }
        return enclos;
    }
}
