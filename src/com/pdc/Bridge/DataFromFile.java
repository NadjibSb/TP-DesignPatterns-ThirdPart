package com.pdc.Bridge;

import com.pdc.dependentClass.Enum.Habitat;
import com.pdc.dependentClass.Enum.RegimeAlimentaire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DataFromFile implements DataGetter {




    @Override
    public String getName(EspeceType especeType) {

        String fileName = getFileName(especeType);
        String name ="";

        BufferedReader in = null;
        String ligne;
        int cpt = 0;

        try {
            in = new BufferedReader(new FileReader(fileName));

            while ((ligne = in.readLine()) != null) {
                cpt++;
                StringTokenizer tok = new StringTokenizer(ligne, ":");
                int nb = tok.countTokens();

                for (int i = 0; i < nb; i++) {
                    String champ = tok.nextToken();
                    if (i == 1 && cpt==1)
                        name=champ;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("fichier non existant");

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

        return name;
    }

    @Override
    public String getContinents(EspeceType especeType) {

        String fileName = getFileName(especeType);
        String continents ="";

        BufferedReader in = null;
        String ligne;
        int cpt = 0;

        try {
            in = new BufferedReader(new FileReader(fileName));

            while ((ligne = in.readLine()) != null) {
                cpt++;
                StringTokenizer tok = new StringTokenizer(ligne, ":");
                int nb = tok.countTokens();

                for (int i = 0; i < nb; i++) {
                    String champ = tok.nextToken();
                    if (i == 1 && cpt==4)
                        continents = Continents(champ);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("fichier non existant");

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

        return continents;
    }

    @Override
    public Habitat getHabitat(EspeceType especeType) {

        String fileName = getFileName(especeType);
        String habitat ="";

        BufferedReader in = null;
        String ligne;
        int cpt = 0;

        try {
            in = new BufferedReader(new FileReader(fileName));

            while ((ligne = in.readLine()) != null) {
                cpt++;
                StringTokenizer tok = new StringTokenizer(ligne, ":");
                int nb = tok.countTokens();

                for (int i = 0; i < nb; i++) {
                    String champ = tok.nextToken();
                    if (i == 1 && cpt==5)
                        habitat = champ;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("fichier non existant");

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

        return Habitat(habitat);
    }

    @Override
    public RegimeAlimentaire gerRegime(EspeceType especeType) {

        String fileName = getFileName(especeType);
        String regime ="";

        BufferedReader in = null;
        String ligne;
        int cpt = 0;

        try {
            in = new BufferedReader(new FileReader(fileName));

            while ((ligne = in.readLine()) != null) {
                cpt++;
                StringTokenizer tok = new StringTokenizer(ligne, ":");
                int nb = tok.countTokens();

                for (int i = 0; i < nb; i++) {
                    String champ = tok.nextToken();
                    if (i == 1 && cpt==7)
                        regime = champ;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("fichier non existant");

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

        return makeRegime(regime);
    }

    @Override
    public int getDureeVie(EspeceType especeType) {

        String fileName = getFileName(especeType);
        String dureeVie ="";

        BufferedReader in = null;
        String ligne;
        int cpt = 0;

        try {
            in = new BufferedReader(new FileReader(fileName));

            while ((ligne = in.readLine()) != null) {
                cpt++;
                StringTokenizer tok = new StringTokenizer(ligne, ":");
                int nb = tok.countTokens();

                for (int i = 0; i < nb; i++) {
                    String champ = tok.nextToken();
                    if (i == 1 && cpt==6)
                        dureeVie=champ;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("fichier non existant");

        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }

        return Integer.parseInt(dureeVie);
    }






    private String getFileName(EspeceType especeType){
        String fileName="";
        switch (especeType){
            case Abeille:
                fileName = "abeille.esp";
                break;
            case Addax:
                fileName = "addax.esp";
                break;
            case Araignee:
                fileName = "araignee.esp";
                break;
            case Autruche:
                fileName = "autruche.esp";
                break;
            case Crapaud_commun:
                fileName = "crapaud_commun.esp";
                break;
            case Escargot:
                fileName = "escargot.esp";
                break;
            case Fourmi:
                fileName = "fourmi.esp";
                break;
            case Lion:
                fileName = "Lion.esp";
                break;
            case Mouton:
                fileName = "mouton.esp";
                break;
            case Poisson_mandarin:
                fileName = "poisson_mandarin.esp";
                break;

        }
        return "SPEC/" +fileName;
    }

    private String Continents(String s) {
        StringTokenizer tok = new StringTokenizer(s, ",");
        String resultat = "";
        int nb = tok.countTokens();
        for (int i = 0; i < nb; i++) {
            String cont = tok.nextToken();
            switch (cont) {
                case "0":
                    resultat = resultat + "Afrique ";
                    break;
                case "1":
                    resultat = resultat + "Europe ";
                    break;
                case "2":
                    resultat = resultat + "Antartique ";
                    break;
                case "3":
                    resultat = resultat + "Asie ";
                    break;
                case "4":
                    resultat = resultat + "Amerique ";
                    break;
                case "5":
                    resultat = resultat + "Oceanie ";
                    break;

            }
        }
        return resultat;
    }

    private Habitat Habitat(String s) {
        Habitat resultat = null;
        switch (s) {
            case "0":
                resultat = Habitat.eau;
                break;
            case "1":
                resultat = Habitat.terre;
                break;
            case "2":
                resultat = Habitat.air;
                break;
            case "1,0":
                resultat = Habitat.terre_eau;
                break;
            case "0,1":
                resultat = Habitat.terre_eau;
                break;
        }
        return resultat;
    }

    private RegimeAlimentaire makeRegime(String s) {
        RegimeAlimentaire resultat = null;
        switch (s) {
            case "0":
                resultat = RegimeAlimentaire.Carnivore;
                break;
            case "1":
                resultat = RegimeAlimentaire.Herbivore;
                break;
            case "2":
                resultat = RegimeAlimentaire.Omnivore;
                break;
        }
        return resultat;
    }
}
