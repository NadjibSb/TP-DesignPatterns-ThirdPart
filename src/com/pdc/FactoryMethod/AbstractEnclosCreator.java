package com.pdc.FactoryMethod;

import com.pdc.Enum.*;

public abstract class AbstractEnclosCreator {

    public abstract Enclos creatEnclos(EnclosType type, int lrg, int lgr, Enum typeSol_Eau, Double size);
}
