package com.pdc.Bridge;

public class _Client {

    public static void main(String[] args){
        DataGetter dataGetter= new DataFromFile();

        Espece espece;
        espece = new Espece(dataGetter,EspeceType.Abeille);
        System.out.println(espece.toString());

        espece = new Espece(dataGetter,EspeceType.Mouton);
        System.out.println(espece.toString());
    }
}
