package com.pdc.Project.Strategy;

public class NumericDataValidator extends DataValidator {


    @Override
    public boolean validate(String txt) {

        try {
            Integer.parseInt(txt);

        } catch(NumberFormatException e) {
            return false;

        } catch(NullPointerException e) {
            return false;
        }

        return true;
    }
}
