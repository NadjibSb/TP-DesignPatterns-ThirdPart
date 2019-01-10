package com.pdc.Project;

import com.pdc.Project.Bridge.Animals;
import com.pdc.Project.Bridge.DataFromFile;
import com.pdc.Project.Bridge.DataGetter;
import com.pdc.Project.Enum.EtatSante;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormAnimal extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton ajout = new JButton("Ajouter");
    private JTextField entrerRace = new JTextField();
    JTextField entrerPoids = new JTextField();
    private JTextField entrerDate = new JTextField();

    private JComboBox<String> espece = new JComboBox<String>(new String[]{"abeille", "addax", "araignee", "autruche", "crapaud_commun", "escargot", "fourmi", "lion", "mouton", "poisson_mandarin"});
    private JComboBox<String> etat_sante = new JComboBox<String>(new String[]{"Gravement malade", "Malade", "Bonne sante"});
    private Zoo z;
    private Animal nvAnimal = new Animal();
    private int numero_enclos;
    private Enclos enclos;


    public FormAnimal(Zoo zoo) {
        z = zoo;
        this.setVisible(true);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        setBounds(400, 60, 600, 600);
        contentPane.setLayout(null);

        JLabel titre = new JLabel("Formulaire Animal");
        titre.setBounds(75, 15, 399, 20);
        contentPane.add(titre);
        Font font = new Font("Century Gothic", Font.BOLD, 18);
        titre.setFont(font);


        JLabel LabelEspece = new JLabel("Espece");
        LabelEspece.setBounds(10, 78, 300, 20);
        contentPane.add(LabelEspece);

        espece.setBounds(400, 70, 150, 20);
        contentPane.add(espece);


        JLabel LabelRace = new JLabel("Race");
        LabelRace.setBounds(10, 120, 300, 20);
        contentPane.add(LabelRace);

        entrerRace.setText("");
        entrerRace.setBounds(400, 120, 150, 20);
        contentPane.add(entrerRace);

        JLabel LabelDate = new JLabel("Date de naissance");
        LabelDate.setBounds(10, 170, 300, 20);
        contentPane.add(LabelDate);

        entrerDate.setText("");
        entrerDate.setBounds(400, 170, 150, 20);
        contentPane.add(entrerDate);

        JLabel LabelSante = new JLabel("Etat de sant� ");
        LabelSante.setBounds(10, 218, 300, 20);
        contentPane.add(LabelSante);

        etat_sante.setBounds(400, 220, 150, 20);
        contentPane.add(etat_sante);


        JLabel titre_poids = new JLabel("Entrez le poids de l'animal");
        titre_poids.setBounds(10, 339, 300, 20);
        contentPane.add(titre_poids);


        entrerPoids.setText("");
        entrerPoids.setBounds(400, 360, 150, 20);
        contentPane.add(entrerPoids);


        ajout.setBounds(314, 470, 135, 42);
        ajout.addActionListener(this);
        contentPane.add(ajout);
    }

    public int getNumero_enclos() {
        return enclos.getAdr();

    }

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == ajout) {
            if (!(entrerRace.getText()).equals("") && (!(entrerDate.getText()).equals("")) && (!(entrerPoids.getText()).equals(""))) {
                nvAnimal.setRace(entrerRace.getText());
                nvAnimal.setDate(entrerDate.getText());
                nvAnimal.setPoids(Integer.parseInt(entrerPoids.getText()));

                DataGetter dataGetter = new DataFromFile();

                String s = espece.getSelectedItem().toString();
                switch (s) {
                    case "abeille":
                        Espece esp1 = new Insecte(dataGetter, Animals.Abeille);
                        nvAnimal.setEspece(esp1);
                        break;
                    case "addax":
                        Espece esp2 = new Mammifere(dataGetter, Animals.Addax);
                        nvAnimal.setEspece(esp2);
                        break;
                    case "araignee":
                        Espece esp3 = new Arachnide(dataGetter, Animals.Araignee);
                        nvAnimal.setEspece(esp3);
                        break;
                    case "autruche":
                        Espece esp4 = new Oiseau(dataGetter, Animals.Autruche);
                        nvAnimal.setEspece(esp4);
                        break;
                    case "crapaud_commun":
                        Espece esp5 = new Amphibien(dataGetter, Animals.Crapaud_commun);
                        nvAnimal.setEspece(esp5);
                        break;
                    case "escargot":
                        Espece esp6 = new Mollusque(dataGetter, Animals.Escargot);
                        nvAnimal.setEspece(esp6);
                        break;
                    case "fourmi":
                        Espece esp7 = new Insecte(dataGetter, Animals.Fourmi);
                        nvAnimal.setEspece(esp7);
                        break;
                    case "lion":
                        Espece esp8 = new Mammifere(dataGetter, Animals.Lion);
                        nvAnimal.setEspece(esp8);
                        break;
                    case "mouton":
                        Espece esp9 = new Mammifere(dataGetter, Animals.Mouton);
                        nvAnimal.setEspece(esp9);
                        break;
                    case "poisson_mandarin":
                        Espece esp10 = new Poisson(dataGetter, Animals.Poisson_mandarin);
                        nvAnimal.setEspece(esp10);
                        break;

                }

                String e = etat_sante.getSelectedItem().toString();
                switch (e) {
                    case "Gravement malade":
                        EtatSante etat1 = EtatSante.GravementMalade;
                        nvAnimal.setSante(etat1);
                        break;
                    case "Malade":
                        EtatSante etat2 = EtatSante.Malade;
                        nvAnimal.setSante(etat2);
                        break;
                    case "Bonne sante":
                        EtatSante etat3 = EtatSante.BonneSante;
                        nvAnimal.setSante(etat3);
                        break;

                }

            } else {
                JOptionPane.showMessageDialog(null, "veuillez revoir les donn�es");
            }

            placer_animal pA = new placer_animal(z, nvAnimal);

        }
    }

}
