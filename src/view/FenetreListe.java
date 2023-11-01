package view;
import java.awt.BorderLayout;
import model.*;
import java.awt.Dimension;
import controler.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class FenetreListe extends JFrame {
  
	
	Mairie m;
	
	
	public FenetreListe(Mairie mr) {
		m = mr;
		this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	
		String [] col= {"Nom","Prenom","Identifiant","DateN"};
		Object [][] data = {};
		data=m.toTable(m.listCitoyens);
		JTable table = new JTable (data,col);
		DefaultTableModel tableModel= new DefaultTableModel(data, col);

	       
	        table = new JTable(tableModel);

	     
	        JScrollPane scrollPane = new JScrollPane(table);

	    
	        getContentPane().add(scrollPane, BorderLayout.CENTER);
       
       
    	this.pack();		
    	this.setVisible(true);
	  
	  
  }
	
	
	
}
