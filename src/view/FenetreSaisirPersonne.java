package view;
import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.GridLayout;
import view.*;
import controler.*;
import model.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class FenetreSaisirPersonne extends JFrame {
    Mairie m;  
    
	public FenetreSaisirPersonne(Mairie mr) {
		m=mr;
		this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1,2));
		
		//this.pack();
	//	this.setVisible(true);
		
		
		// Création des zones de texte
		JPanel panel = new JPanel();
		
		
		
		JTextField zoneNom= new JTextField("Nom", 20);
		JTextField zonePrenom = new JTextField("Prenom", 20);
		JTextField zoneIdentifiant = new JTextField("Identifiant", 20);
		JTextField zoneDateNaiss = new JTextField("Date de naissance", 20);
		JButton boutonAjouter = new JButton("Ajouter la personne") ;
		
		panel.add(zoneNom);
    	panel.add(zonePrenom);
    	panel.add(zoneIdentifiant);
    	panel.add(zoneDateNaiss);
    	panel.add(boutonAjouter);
		SaisirListener s = new SaisirListener(m,zoneIdentifiant,zoneNom,zonePrenom,zoneDateNaiss);
		boutonAjouter.addActionListener(s);
		
    	// Ajout du panel à la fenêtre
		String [] col= {"Identifiant","Nom","Prenom","DateN"};
		Object [][] data = {};
		data=m.toTable(m.listCitoyens);
		JTable table = new JTable (data,col);
		DefaultTableModel tableModel= new DefaultTableModel(data, col);

	       
	        table = new JTable(tableModel);

	     
	        JScrollPane scrollPane = new JScrollPane(table);

	    
	        getContentPane().add(scrollPane, BorderLayout.CENTER);
       
        add(panel);
    	this.pack();		
    	this.setVisible(true);
	  
    
    	
  }
}
	
	
	

