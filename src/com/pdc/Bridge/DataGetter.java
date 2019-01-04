package com.pdc.Bridge;

import com.pdc.dependentClass.Enum.*;

public interface DataGetter {
    public String getName(EspeceType especeType);
    public String getContinents(EspeceType especeType);
    public Habitat getHabitat(EspeceType especeType);
    public RegimeAlimentaire gerRegime(EspeceType especeType);
    public int getDureeVie(EspeceType especeType);

}
