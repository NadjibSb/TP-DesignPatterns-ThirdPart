package com.pdc.implementedPatterns.Strategy;

public class AlphanumDataValidator extends DataValidator {
    @Override
    public boolean validate(String txt) {
        return txt.matches("[A-Za-z0-9]+");
    }
}
