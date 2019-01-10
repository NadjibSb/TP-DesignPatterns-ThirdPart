package com.pdc.Project.FactoryMethod;

import com.pdc.Project.Enclos;

public abstract class AbstractEnclosCreator {

    public abstract Enclos creatEnclos(EnclosType type, double lrg, double lgr, Enum typeSol_Eau, double size);
}
