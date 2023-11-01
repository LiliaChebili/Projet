package controler;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import model.*;
import view.FenetreNaissance;
import view.FenetreSaisirPersonne;
import java.util.List;
import javax.swing.*;

public class SaisirListener implements ActionListener {
		
		Mairie mairie;
		JTextField zoneNom;
		JTextField zonePrenom;
		JTextField zoneIdentifiant;
		JTextField zoneDateNaiss;


		public SaisirListener(Mairie mairie_c,JTextField zoneIdentifiant_c, JTextField zoneNom_c, JTextField zonePrenom_c,  JTextField zoneDateNaiss_c) {
			mairie = mairie_c;
			zoneIdentifiant = zoneIdentifiant_c;
			zoneNom = zoneNom_c;
			zonePrenom = zonePrenom_c;
			zoneDateNaiss = zoneDateNaiss_c;
		
		}
		
		
		public void actionPerformed(ActionEvent e) {
			
			String nomC = zoneNom.getText();
			String prenomC = zonePrenom.getText();
			int idC = Integer.parseInt(zoneIdentifiant.getText());
			String datenaissC = zoneDateNaiss.getText();
			
			if (((JButton)e.getSource()).getText().equals("Ajouter la personne")) {
				
				Citoyen citoyen = new Citoyen (idC, nomC, prenomC, datenaissC);
				
				
				for(int i=0;i<mairie.listCitoyens.size(); i++) {
					if(mairie.listCitoyens.get(i) == citoyen) {
						return;
					}
				}
				mairie.ajouterCitoyen(citoyen);
				FenetreSaisirPersonne mimi = new FenetreSaisirPersonne (mairie);
				mimi.setVisible(true);
				
				//ajouter citoyen
				
				
				//vider les champs
				zoneNom.setText("");
				zonePrenom.setText("");
				zoneIdentifiant.setText("");
				zoneDateNaiss.setText("");
	
		
			   

			}
		}
	}

