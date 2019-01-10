package com.pdc.implementedPatterns.Strategy;

public class TextField {

    private String content;
    DataValidator dataValidator;

    public TextField(String content, DataValidator dataValidator) {
        this.content=content;
        this.dataValidator=dataValidator;
    }

    public boolean validate(){
        return this.dataValidator.validate(this.content);
    }
}
