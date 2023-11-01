package view;

import javax.swing.*;

import controler.*;

import java.awt.*;
import model.*
;
public class Menu extends JFrame {
       Mairie ma;

     JPanel panel = new JPanel();
     JButton marriageButton = new JButton("Mariage");
     JButton divorceButton= new JButton("Divorce");
     JButton birthButton= new JButton("Naissance");
     JButton personStateButton= new JButton("Etat d'une personne");
     JButton displayListButton= new JButton("Liste des personnes");
     JButton addPersonButton= new JButton("Ajouter une personne");
     JButton quitButton= new JButton("Quitter");
     
     
     
    public Menu(Mairie lm) {
    	
    	 ma=lm;
        this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500,500));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
		panel.setLayout(new GridLayout(7,1));
		panel.setPreferredSize(new Dimension(600,200));
		getContentPane().add(panel);
		
        panel.add(marriageButton);
        panel.add(divorceButton);
        panel.add(birthButton);
        panel.add(personStateButton);
        panel.add(displayListButton);
        panel.add(addPersonButton);
        panel.add(quitButton);
        

		MenuListener m = new MenuListener(ma);
		marriageButton.addActionListener(m);
		divorceButton.addActionListener(m);
		birthButton.addActionListener(m);
		personStateButton.addActionListener(m);
		displayListButton.addActionListener(m);
		displayListButton.addActionListener(m);
		addPersonButton.addActionListener(m);
		quitButton.addActionListener(m);
		
        this.setContentPane(panel);
        this.pack();
        this.setVisible(true);


    }

}
