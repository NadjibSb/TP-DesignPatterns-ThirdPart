package com.pdc.implementedPatterns.FactoryMethod;

import com.pdc.implementedPatterns.dependentClass.Enum.*;

public class _Client {

    public static void main(String[] args){


        AbstractEnclosCreator enclosCreator= new EnclosCreator();

        Enclos enclos;
        enclos = enclosCreator.creatEnclos(EnclosType.Cage,10,10,TypeSol.Sable,0 );
        System.out.println("\n"+enclos.toString());

        enclos = enclosCreator.creatEnclos(EnclosType.Insectarium,5,5,null,0);
        System.out.println("\n"+enclos.toString());

        enclos = enclosCreator.creatEnclos(EnclosType.Paludarium,2,3,TypeSol.Argile,100);
        System.out.println("\n"+enclos.toString());

        enclos = enclosCreator.creatEnclos(EnclosType.Voliere,2,3,null,10);
        System.out.println("\n"+enclos.toString());
    }
}
