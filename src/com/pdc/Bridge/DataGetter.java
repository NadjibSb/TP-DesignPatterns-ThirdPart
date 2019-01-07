package com.pdc.Bridge;

import com.pdc.dependentClass.Enum.*;

public interface DataGetter {
    public String getName(Animals especeType);
    public String getContinents(Animals especeType);
    public Habitat getHabitat(Animals especeType);
    public RegimeAlimentaire gerRegime(Animals especeType);
    public int getDureeVie(Animals especeType);

}
