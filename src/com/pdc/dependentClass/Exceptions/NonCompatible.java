package com.pdc.dependentClass.Exceptions;

public class NonCompatible extends Exception {

    public String getMessage() {
        return "L'animal est incompatible avec l'enclos ! ";
    }
}
