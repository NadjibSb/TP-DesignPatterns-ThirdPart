package com.pdc.Project.Bridge;


import com.pdc.Project.Enum.*;

public interface DataGetter {
    public String getName(Animals especeType);
    public String getContinents(Animals especeType);
    public Habitat getHabitat(Animals especeType);
    public RegimeAlimentaire gerRegime(Animals especeType);
    public int getDureeVie(Animals especeType);
    public int getCharacteristic(Animals especeType,AnimalCharac charac);
}
