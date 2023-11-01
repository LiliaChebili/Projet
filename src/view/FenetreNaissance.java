package view;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.*;
import view.*;
import controler.*;

public class FenetreNaissance extends JFrame {
  
	
	
	
	Mairie m;
	public FenetreNaissance(Mairie mr) {
		m = mr;
	
		this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(1,2));
		
		//this.pack();
		//this.setVisible(true);
		
		
		JPanel panel = new JPanel();
		JTextField zoneTextePere = new JTextField("Identifiant Père", 20);
		JTextField zoneTexteMere = new JTextField("Identifiant Mère", 20);
		JTextField zoneTexteNaiss = new JTextField("Date de naissance",20);
		JButton boutonAjouterNaissance = new JButton("Ajouter une Naissance") ;
		
		
		
		panel.add(zoneTextePere);
    	panel.add(zoneTexteMere);
    	panel.add(zoneTexteNaiss);
    	panel.add(boutonAjouterNaissance);
    
    	// Ajout du panel à la fenêtre
    	this.getContentPane().add(panel);
    	this.pack();
    	this.setVisible(true);
    	
    	
    	NaissanceListener s = new NaissanceListener(m,zoneTextePere,zoneTexteMere,zoneTexteNaiss);
		boutonAjouterNaissance.addActionListener(s);
    	
		String [] col= {"idp","idm","DateN"};
		Object [][] data = {};
		data=m.toTable2(m.listNaissance);
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
	
	
	

