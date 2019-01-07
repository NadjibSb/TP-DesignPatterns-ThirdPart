package com.pdc.Bridge;

public class _Client {

    public static void main(String[] args){
        DataGetter dataGetter= new DataFromFile();

        Espece espece;
        espece = new Espece(dataGetter,Animals.Abeille);
        System.out.println(espece.toString());

        espece = new Espece(dataGetter,Animals.Mouton);
        System.out.println(espece.toString());
    }
}
