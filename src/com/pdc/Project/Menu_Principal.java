package com.pdc.Project;

import com.pdc.Project.Bridge.Animals;
import com.pdc.Project.Bridge.DataFromFile;
import com.pdc.Project.Bridge.DataGetter;
import com.pdc.Project.Enum.TypeEau;
import com.pdc.Project.Enum.TypeSol;
import com.pdc.Project.FactoryMethod.AbstractEnclosCreator;
import com.pdc.Project.FactoryMethod.EnclosCreator;
import com.pdc.Project.FactoryMethod.EnclosType;
import com.pdc.Project.Strategy.NumericDataValidator;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu_Principal extends JFrame {
    private JPanel panel1;



    public static void main(String[] args) {

        AbstractEnclosCreator enclosCreator;
        enclosCreator = new EnclosCreator();
        Enclos e1 = enclosCreator.creatEnclos(EnclosType.Aquarium,2,3,TypeEau.Douce,60);
        Enclos e2 = enclosCreator.creatEnclos(EnclosType.Insectarium,2,3,null,0);
        Enclos e3 = enclosCreator.creatEnclos(EnclosType.Aquarium,2,3,TypeEau.Sale,60);
        Enclos e4 = enclosCreator.creatEnclos(EnclosType.Cage,2,3,TypeSol.Plantes,0);
        Enclos e5 = enclosCreator.creatEnclos(EnclosType.Paludarium,2,3,TypeSol.Argile,100);
        Enclos e6 = enclosCreator.creatEnclos(EnclosType.Voliere,2,3,null,10);
        Enclos e7 = enclosCreator.creatEnclos(EnclosType.Cage,2,3,TypeSol.Roches,60);
        Enclos e8 = enclosCreator.creatEnclos(EnclosType.Cage,2,3,TypeSol.Plantes,60);
        Enclos e9= enclosCreator.creatEnclos(EnclosType.Paludarium,2,3,TypeSol.Glaces,200);

        formulaireZoo.enclos.add(e1);
        formulaireZoo.enclos.add(e2);
        formulaireZoo.enclos.add(e3);
        formulaireZoo.enclos.add(e4);
        formulaireZoo.enclos.add(e5);
        formulaireZoo.enclos.add(e6);
        formulaireZoo.enclos.add(e7);
        formulaireZoo.enclos.add(e8);
        formulaireZoo.enclos.add(e9);


        DataGetter dataGetter = new DataFromFile();
        Animal a1 = new Animal(new Espece(dataGetter, Animals.Lion));
        Animal a2 = new Animal(new Espece(dataGetter, Animals.Lion));
        Animal a3 = new Animal(new Espece(dataGetter, Animals.Lion));
        Animal a4 = new Animal(new Espece(dataGetter, Animals.Mouton));
        Animal a5 = new Animal(new Espece(dataGetter, Animals.Abeille));
        Animal a6 = new Animal(new Espece(dataGetter, Animals.Abeille));
        Animal a7 = new Animal(new Espece(dataGetter, Animals.Abeille));

        placer_animal.animaux.add(a1);
        placer_animal.animaux.add(a2);
        placer_animal.animaux.add(a3);
        placer_animal.animaux.add(a4);
        placer_animal.animaux.add(a5);
        placer_animal.animaux.add(a6);
        placer_animal.animaux.add(a7);


        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Menu_Principal frame = new Menu_Principal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private Panneau panel;


    public Menu_Principal() {
        //this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        setBounds(100, 100, 985, 550);


        panel1 = new Panneau();
        getContentPane().add(panel1);
        panel1.setBackground(new Color(20, 180, 140));
        panel1.setLayout(null);


        JButton nouveauZoo = new JButton(" Nouveau Zoo ");
        nouveauZoo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JFrame form = new formulaireZoo(new NumericDataValidator());
            }
        });
        nouveauZoo.setBackground(Color.GRAY);
        nouveauZoo.setIcon(new ImageIcon("icon1.png"));
        nouveauZoo.setBounds(100, 150, 200, 200);
        panel1.add(nouveauZoo);

        JButton chargerZoo = new JButton("Charger Zoo ");
        chargerZoo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Zoo Files", "zoo");
                fc.setFileFilter(filter);
                JFrame choix = new JFrame();
                choix.setVisible(true);
                choix.setBounds(100, 100, 900, 500);
                choix.getContentPane().add(fc);
                fc.setVisible(true);
            }
        });
        chargerZoo.setIcon(new ImageIcon("icon2.png"));
        chargerZoo.setBackground(Color.GRAY);
        chargerZoo.setBounds(370, 150, 200, 200);
        panel1.add(chargerZoo);

        JButton visiteur = new JButton("Visiteur");
        visiteur.setIcon(new ImageIcon("icon3.png"));
        visiteur.setBackground(Color.GRAY);
        visiteur.setBounds(650, 150, 200, 200);
        panel1.add(visiteur);


    }
}
