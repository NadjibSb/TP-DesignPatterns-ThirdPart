package com.pdc.FactoryMethod;

import com.pdc.dependentClass.Enum.*;

public class _Client {

    public static void main(String[] args){

        AbstractEnclosCreator enclosCreator= new EnclosCreator();

        Enclos enclos;
        enclos = enclosCreator.creatEnclos(EnclosType.Cage,10,10,TypeSol.Sable,null );
        System.out.println(enclos.toString());

        enclos = enclosCreator.creatEnclos(EnclosType.Insectarium,5,5,null,null);
        System.out.println(enclos.toString());

    }
}
