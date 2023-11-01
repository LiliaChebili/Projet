package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.*;
import view.*;


public class ListeListener implements ActionListener {
	Mairie mairie;
	public ListeListener(Mairie mairie_c){
		mairie = mairie_c;	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (((JButton)e.getSource()).getText().equals("Afficher la liste de tous les citoyens")) {
				
			FenetreListe mimi = new FenetreListe (mairie);
			mimi.setVisible(true);	   

			}
		}
		
		
	}
	
	

