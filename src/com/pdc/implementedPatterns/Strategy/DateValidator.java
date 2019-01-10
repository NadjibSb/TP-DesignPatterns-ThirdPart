package com.pdc.implementedPatterns.Strategy;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidator extends DataValidator {
    @Override
    public boolean validate(String txt) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(txt.trim());
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }
}
