package com.pdc.Project;

import com.pdc.Project.Enum.TypeEau;
import com.pdc.Project.Enum.TypeSol;
import com.pdc.Project.FactoryMethod.AbstractEnclosCreator;
import com.pdc.Project.FactoryMethod.EnclosCreator;
import com.pdc.Project.FactoryMethod.EnclosType;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class formulaireEnclos extends JFrame {


	protected Zoo zoo;
	private AbstractEnclosCreator enclosCreator;
	private JPanel contentPane;
	private JTextField entrerID;
	private JTextField entrerLng;
	private JTextField entrerLrg;
	private JTextField entrerMax;
	
	JComboBox<String> comboBox;
	JComboBox entrerTypeEau;
	JComboBox entrerTypeSol;
	
	private JTextField entrerChamp1;
	private JTextField entrerChamp2;
	private JLabel labelChamp1;
	private JLabel labelChamp2;
	JButton enregistrer;
	JPanel panel;
	

	public formulaireEnclos(Zoo zoo) {
		this.zoo = zoo;
		enclosCreator = new EnclosCreator();
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 616, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel titre = new JLabel("Formulaire d'un nouveau Enclos");
		titre.setFont(new Font("Century Gothic", Font.BOLD, 18));
		contentPane.add(titre, BorderLayout.NORTH);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel labelID = new JLabel("Identifiant");
		labelID.setBounds(43, 37, 57, 16);
		panel.add(labelID);
		
		entrerID = new JTextField();
		entrerID.setBounds(155, 34, 116, 22);
		panel.add(entrerID);
		entrerID.setColumns(10);
		
		JLabel labelLng = new JLabel("Longueur ");
		labelLng.setBounds(43, 98, 57, 16);
		panel.add(labelLng);
		
		entrerLng = new JTextField();
		entrerLng.setBounds(155, 95, 116, 22);
		panel.add(entrerLng);
		entrerLng.setColumns(10);
		
		JLabel labelLrg = new JLabel("Largeur");
		labelLrg.setBounds(311, 98, 57, 16);
		panel.add(labelLrg);
		
		entrerLrg = new JTextField();
		entrerLrg.setBounds(399, 95, 116, 22);
		panel.add(entrerLrg);
		entrerLrg.setColumns(10);
		
		JLabel labelMax = new JLabel("Max d'animaux");
		labelMax.setBounds(43, 153, 85, 16);
		panel.add(labelMax);
		
		entrerMax = new JTextField();
		entrerMax.setBounds(155, 150, 116, 22);
		panel.add(entrerMax);
		entrerMax.setColumns(10);
		
		JLabel labelType = new JLabel("Type de l'Enclos");
		labelType.setBounds(39, 203, 92, 16);
		panel.add(labelType);
		
		comboBox = new JComboBox(new String[]{"Cage","Aquarium","Voliere","Insectarium","Paludarium"});
		comboBox.setBounds(155, 200, 116, 22);
		comboBox.setSelectedIndex(-1);
        comboBox.addActionListener(new Combo());
        
		panel.add(comboBox);
		
		
		enregistrer = new JButton("Ajouter");
		enregistrer.setBounds(448, 406, 95, 25);
		panel.add(enregistrer);



		class Ajout implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				Enclos enclos = null;
				String selectionne = (String) comboBox.getSelectedItem();


				if (selectionne.equals("Paludarium")) {
					String typeSol_enum = (String) entrerTypeSol.getSelectedItem();
					TypeSol type = null;
					if (typeSol_enum == "Sable") type = TypeSol.Sable;
					else if (typeSol_enum == "Argile") type = TypeSol.Argile;
					else if (typeSol_enum == "Roches") type = TypeSol.Roches;
					else if (typeSol_enum == "Plantes") type = TypeSol.Plantes;
					else if (typeSol_enum == "Glaces") type = TypeSol.Glaces;
					try {
						enclos = enclosCreator.creatEnclos(EnclosType.Paludarium,Double.parseDouble(entrerLng.getText()),Double.parseDouble(entrerLrg.getText()),type,Double.parseDouble(entrerChamp2.getText()));
					} catch (Exception excep) {
						JOptionPane.showMessageDialog(null, "Format incorrect");
					}
				} else if (selectionne.equals("Voliere")) {

					try {
						enclos = enclosCreator.creatEnclos(EnclosType.Voliere,Double.parseDouble(entrerLng.getText()),Double.parseDouble(entrerLrg.getText()),null,Double.parseDouble(entrerChamp2.getText()));
					} catch (Exception excep) {
						JOptionPane.showMessageDialog(null, "Format incorrect");
					}


				} else if (selectionne.equals("Cage")) {
					String typeSol_enum1 = (String) entrerTypeSol.getSelectedItem();
					TypeSol type = null;
					if (typeSol_enum1 == "Sable") type = TypeSol.Sable;
					else if (typeSol_enum1 == "Argile") type = TypeSol.Argile;
					else if (typeSol_enum1 == "Roches") type = TypeSol.Roches;
					else if (typeSol_enum1 == "Plantes") type = TypeSol.Plantes;
					else if (typeSol_enum1 == "Glaces") type = TypeSol.Glaces;
					try {
						enclos = enclosCreator.creatEnclos(EnclosType.Cage,Double.parseDouble(entrerLng.getText()),Double.parseDouble(entrerLrg.getText()),type,0);
					} catch (Exception excep) {
						JOptionPane.showMessageDialog(null, "Format incorrect");
					}
				} else if (selectionne.equals("Aquarium")) {
					TypeEau type = null;
					String typeEau_enum = (String) entrerTypeSol.getSelectedItem();

					if (typeEau_enum == "Douce") type = TypeEau.Douce;
					else if (typeEau_enum == "Sal�e") type = TypeEau.Sale;

					try {
						enclos = enclosCreator.creatEnclos(EnclosType.Aquarium,Double.parseDouble(entrerLng.getText()),Double.parseDouble(entrerLrg.getText()),type,Double.parseDouble(entrerChamp2.getText()));
					} catch (Exception excep) {
						JOptionPane.showMessageDialog(null, "Format incorrect");
					}
				} else if (selectionne.equals("Insectarium")) {
					try {
						enclos = enclosCreator.creatEnclos(EnclosType.Insectarium,Double.parseDouble(entrerLng.getText()),Double.parseDouble(entrerLrg.getText()),null,Double.parseDouble(entrerChamp2.getText()));
					} catch (Exception excep) {
						JOptionPane.showMessageDialog(null, "Format incorrect");
					}
				}
				try {

					zoo.ajouterEnclos(enclos);
					formulaireZoo.enclos.add(enclos);
					JOptionPane.showMessageDialog(null, "Enclos ajout� avec succes");
				} catch (Exception excep) {
					JOptionPane.showMessageDialog(null, "Format Incorrect");
				}


			}
		}
		enregistrer.addActionListener(new Ajout());
		
}




	class Combo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
        String selected = (String) comboBox.getSelectedItem();
        
        if (selected.equals("Voliere") || selected.equals("Insectarium")) {
        	
        	if(entrerChamp1!=null)panel.remove(entrerChamp1);
        	if(labelChamp1!=null)panel.remove(labelChamp1);
        	if(entrerChamp2!=null)panel.remove(entrerChamp2);
        	if(labelChamp2!=null)panel.remove(labelChamp2);
        	if (entrerTypeEau !=null) panel.remove(entrerTypeEau);
        	if (entrerTypeSol !=null) panel.remove(entrerTypeSol);
        	entrerChamp1 = new JTextField();
    		entrerChamp1.setColumns(10);
    		entrerChamp1.setBounds(155, 258, 116, 22);
    		panel.add(entrerChamp1);
    		
    		labelChamp1 = new JLabel("Hauteur");
    		labelChamp1.setBounds(43, 262, 85, 16);
    		panel.add(labelChamp1);
    		
    		panel.repaint();
        } else if (selected.equals("Cage")) {
        	if(entrerChamp1!=null)panel.remove(entrerChamp1);
        	if(labelChamp1!=null)panel.remove(labelChamp1);
        	if(entrerChamp2!=null)panel.remove(entrerChamp2);
        	if(labelChamp2!=null)panel.remove(labelChamp2);
        	if (entrerTypeEau !=null) panel.remove(entrerTypeEau);
        	if (entrerTypeSol !=null) panel.remove(entrerTypeSol);
        	
        	entrerTypeSol = new JComboBox(new String[] {"Argile","Sable","Roches","Plantes","Glaces"});
        	entrerTypeSol.setSelectedIndex(-1);
        	entrerTypeSol.setBounds(155, 258, 116, 22);
        	panel.add(entrerTypeSol);

    		
    		labelChamp1 = new JLabel("Type de sol ");
    		labelChamp1.setBounds(43, 262, 85, 16);
    		panel.add(labelChamp1);
    		panel.repaint();
        } else if (selected.equals("Aquarium")) {
        	if(entrerChamp1!=null)panel.remove(entrerChamp1);
        	if(labelChamp1!=null)panel.remove(labelChamp1);
        	if(entrerChamp2!=null)panel.remove(entrerChamp2);
        	if(labelChamp2!=null)panel.remove(labelChamp2);
        	if (entrerTypeEau !=null) panel.remove(entrerTypeEau);
        	if (entrerTypeSol !=null) panel.remove(entrerTypeSol);
        	
        	entrerTypeEau = new JComboBox(new String[] {"Douce","Sal�e"});
        	entrerTypeEau.setSelectedIndex(-1);
        	entrerTypeEau.setBounds(155, 258, 116, 22);
        	panel.add(entrerTypeEau);
    		
    		labelChamp1 = new JLabel("Type eau ");
    		labelChamp1.setBounds(43, 262, 85, 16);
    		panel.add(labelChamp1);
    		
    		entrerChamp2 = new JTextField();
    		entrerChamp2.setColumns(10);
    		entrerChamp2.setBounds(155, 311, 116, 22);
    		panel.add(entrerChamp2);
    		
    		labelChamp2 = new JLabel("Contenance");
    		labelChamp2.setBounds(43, 315, 85, 16);
    		panel.add(labelChamp2);
    		panel.repaint();
		}else if (selected.equals("Paludarium")) {
        	if(entrerChamp1!=null)panel.remove(entrerChamp1);
        	if(labelChamp1!=null)panel.remove(labelChamp1);
        	if(entrerChamp2!=null)panel.remove(entrerChamp2);
        	if(labelChamp2!=null)panel.remove(labelChamp2);
        	if (entrerTypeEau !=null) panel.remove(entrerTypeEau);
        	if (entrerTypeSol !=null) panel.remove(entrerTypeSol);
        	
        	entrerTypeSol = new JComboBox(new String[] {"Argile","Sable","Roches","Plantes","Glaces"});
        	entrerTypeSol.setSelectedIndex(-1);
        	entrerTypeSol.setBounds(155, 258, 116, 22);
        	panel.add(entrerTypeSol);
        	
    		labelChamp1 = new JLabel("Type de sol ");
    		labelChamp1.setBounds(43, 262, 85, 16);
    		panel.add(labelChamp1);
    		
    		entrerChamp2 = new JTextField();
    		entrerChamp2.setColumns(10);
    		entrerChamp2.setBounds(155, 311, 116, 22);
    		panel.add(entrerChamp2);
    		
    		labelChamp2 = new JLabel("Surface eau");
    		labelChamp2.setBounds(43, 315, 85, 16);
    		panel.add(labelChamp2);
    		
    		panel.repaint();
		}
        
	}
}
}
