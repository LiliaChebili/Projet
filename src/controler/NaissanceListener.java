package controler;

import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import controler.*;
import model.*;

public class NaissanceListener implements ActionListener{

	
	
	Mairie mairie;
	JTextField idp;
	JTextField idm;
	JTextField zoneDateNaiss;
	
	
	public NaissanceListener(Mairie mairie_c, JTextField idpp, JTextField idmm, JTextField zoneDateNaiss_c)
	{
				mairie = mairie_c;
				idp = idpp;
				idm = idmm;
				zoneDateNaiss = zoneDateNaiss_c;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		int idpere = Integer.parseInt(idp.getText());
		int idmere = Integer.parseInt(idm.getText());
		String datenaissC = zoneDateNaiss.getText();
		
		if (((JButton)e.getSource()).getText().equals("Ajouter une Naissance")) {
			
			
			mairie.ajoutNaissance(idpere,idmere,datenaissC);
			FenetreNaissance mimi = new FenetreNaissance (mairie);
			mimi.setVisible(true);
			
			
		

			
			//vider les champs
			idp.setText("");
			idm.setText("");
			zoneDateNaiss.setText("");

	
		   

		}
	}
	}
	
	

        

