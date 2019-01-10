package com.pdc.implementedPatterns.Strategy;

public class _Client {

    public static void main(String[] args){

        TextField textField;

        textField = new TextField("1000",new NumericDataValidator());
        System.out.println("\n 1000 is integer : "+textField.validate());
        textField = new TextField("56h",new NumericDataValidator());
        System.out.println("\n 56h3 is integer : "+textField.validate());

        textField = new TextField("Zoo13",new AlphanumDataValidator());
        System.out.println("\n Zoo13 is AlphaNumeric : "+textField.validate());
        textField = new TextField("Animale>1",new AlphanumDataValidator());
        System.out.println("\n Animale>1 is AlphaNumeric : "+textField.validate());

        textField = new TextField("12-09-2018",new DateValidator());
        System.out.println("\n 12-09-2018 is a date : "+textField.validate());
        textField = new TextField("62-09-2018",new DateValidator());
        System.out.println("\n 62-09-2018 is a date : "+textField.validate());
    }
}
