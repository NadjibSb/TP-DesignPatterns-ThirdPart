package com.pdc.Project;

import com.pdc.Project.Bridge.Animals;
import com.pdc.Project.Bridge.DataFromFile;
import com.pdc.Project.Bridge.DataGetter;
import com.pdc.Project.Enum.TypeEau;
import com.pdc.Project.Enum.TypeSol;
import com.pdc.Project.FactoryMethod.AbstractEnclosCreator;
import com.pdc.Project.FactoryMethod.EnclosCreator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class PlanZoo extends JFrame {

    private JPanel panel;
    private int indicePrincipale = 26;
    static public ArrayList<JButton> cases = new ArrayList<JButton>();

    public PlanZoo(int nb_max) {
        this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel();
        panel.setSize(new Dimension(1100, 500));
        panel.setBorder(new EmptyBorder(0, 0, 0, 0));
        setContentPane(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel.add(panel2);

        panel2.setLayout(null);

        JPanel panelespeces = new JPanel();
        panelespeces.setBounds(210, 144, 210, -80);

        panel2.add(panelespeces);

        JPanel panelEsp = new JPanel();
        panel.add(panelEsp, BorderLayout.SOUTH);

        Box pileEspeces = Box.createHorizontalBox();
        panelEsp.add(pileEspeces);

        JButton Abeille = new JButton("Abeille");
        pileEspeces.add(Abeille);

        JButton Addax = new JButton("Addax");
        pileEspeces.add(Addax);

        JButton Araignee = new JButton("Araignee");
        pileEspeces.add(Araignee);

        JButton Autruche = new JButton("Autruche");
        pileEspeces.add(Autruche);

        JButton Crapaud_commun = new JButton("Crapaud_commun");
        pileEspeces.add(Crapaud_commun);

        JButton Escargot = new JButton("Escargot");
        pileEspeces.add(Escargot);

        JButton Fourmi = new JButton("Fourmi");
        pileEspeces.add(Fourmi);

        JButton Lion = new JButton("Lion");
        pileEspeces.add(Lion);

        JButton Mouton = new JButton("Mouton");
        pileEspeces.add(Mouton);

        JButton Poisson_mandarin = new JButton("Poisson_mandarin");
        pileEspeces.add(Poisson_mandarin);

        DataGetter dataGetter= new DataFromFile();

        Poisson_mandarin.addActionListener(new CouleurList(Poisson_mandarin, new Espece(dataGetter, Animals.Poisson_mandarin)));
        Mouton.addActionListener(new CouleurList(Mouton, new Espece(dataGetter, Animals.Mouton)));
        Lion.addActionListener(new CouleurList(Lion, new Espece(dataGetter, Animals.Lion)));
        Fourmi.addActionListener(new CouleurList(Fourmi, new Espece(dataGetter, Animals.Fourmi)));
        Escargot.addActionListener(new CouleurList(Escargot, new Espece(dataGetter, Animals.Escargot)));
        Crapaud_commun.addActionListener(new CouleurList(Crapaud_commun, new Espece(dataGetter, Animals.Crapaud_commun)));
        Autruche.addActionListener(new CouleurList(Autruche, new Espece(dataGetter, Animals.Autruche)));
        Araignee.addActionListener(new CouleurList(Araignee, new Espece(dataGetter, Animals.Araignee)));
        Addax.addActionListener(new CouleurList(Addax, new Espece(dataGetter, Animals.Addax)));
        Abeille.addActionListener(new CouleurList(Abeille, new Espece(dataGetter, Animals.Abeille)));


        for (int i = 0; i < cases.size(); i++) {

            for (ActionListener al : cases.get(i).getActionListeners())
                cases.get(i).removeActionListener(al);
            cases.get(i).addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                }
            });
            panel2.add(cases.get(i));
            if (cases.get(i).getText() == "P") indicePrincipale = i;
        }
    }

    public void placerEnclos(TreeSet<Enclos> enclos) {

        Iterator<Enclos> it = enclos.iterator();
        JButton b = null;
        int j;
        while (it.hasNext()) {
            Enclos e = it.next();
            if (e instanceof Cage) {
                j = ProchainePlace(indicePrincipale);
                e.setAdr(j);
                b = cases.get(j);
                b.setBackground(new Color(139, 69, 19));
                for (ActionListener al : cases.get(j).getActionListeners())
                    cases.get(j).removeActionListener(al);
                cases.get(j).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        afficher_enclos af = new afficher_enclos(e);
                    }
                });
            } else if (e instanceof Voliere) {
                j = ProchainePlace(indicePrincipale);
                e.setAdr(j);
                b = cases.get(j);
                b.setBackground(Color.YELLOW);
                b.setForeground(Color.BLACK);
                for (ActionListener al : cases.get(j).getActionListeners())
                    cases.get(j).removeActionListener(al);
                cases.get(j).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        afficher_enclos af = new afficher_enclos(e);
                    }
                });
            } else if (e instanceof Aquarium) {
                j = ProchainePlace(indicePrincipale);
                e.setAdr(j);
                b = cases.get(j);
                b.setBackground(Color.BLUE);
                for (ActionListener al : cases.get(j).getActionListeners())
                    cases.get(j).removeActionListener(al);
                cases.get(j).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        afficher_enclos af = new afficher_enclos(e);
                    }
                });
            } else if (e instanceof Paludarium) {
                j = ProchainePlace(indicePrincipale);
                e.setAdr(j);
                b = cases.get(j);
                b.setBackground(Color.GREEN);
                for (ActionListener al : cases.get(j).getActionListeners())
                    cases.get(j).removeActionListener(al);
                cases.get(j).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        afficher_enclos af = new afficher_enclos(e);
                    }
                });
            } else if (e instanceof Insectarium) {
                j = ProchainePlace(indicePrincipale);
                e.setAdr(j);
                b = cases.get(j);
                b.setBackground(Color.ORANGE);
                b.setForeground(Color.BLACK);
                for (ActionListener al : cases.get(j).getActionListeners())
                    cases.get(j).removeActionListener(al);
                cases.get(j).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent arg0) {
                        afficher_enclos af = new afficher_enclos(e);
                    }
                });
            }
        }
    }

    public static int ProchainePlace(int principale) {
        int resultat = 0, i = 1;
        boolean boo1, boo2;
        while ((i < cases.size() / 2)) {
            boo1 = true;
            boo2 = true;
            if (principale + i < cases.size()) {
                if (cases.get(principale + i).getBackground() == Color.BLACK) {
                    boo1 = false;
                    resultat = principale + i;
                    break;
                } else {
                    if (principale - i >= 0) {
                        if (cases.get(principale - i).getBackground() == Color.BLACK) {
                            boo2 = false;
                            resultat = principale - i;
                            break;
                        }
                    }

                }
            }
            if (boo1 == true && boo2 == true) {
                i++;
            }
        }
        return resultat;
    }
}
