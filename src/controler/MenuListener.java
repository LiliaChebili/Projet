package controler;
import javax.swing.*;
import model.*;
import view.FenetreMariage;
import view.FenetreDivorce;
import view.FenetreSaisirPersonne;
import view.FenetreNaissance;
import view.FenetreAffichage;
import view.FenetreListe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MenuListener implements ActionListener {
    Mairie mai;

	public MenuListener(Mairie ma) {
		mai=ma;
		// TODO Auto-generated constructor stub
	}
	public MenuListener() {}
	public void actionPerformed(ActionEvent e) {
		if (((JButton)e.getSource()).getText().equals("Mariage")) {
			FenetreMariage m = new FenetreMariage(mai);
			m.setVisible(true);
		} else if (((JButton)e.getSource()).getText().equals("Divorce")) {
			FenetreDivorce m = new FenetreDivorce(mai);
			m.setVisible(true);
		}else if (((JButton)e.getSource()).getText().equals("Ajouter une personne")) {
			FenetreSaisirPersonne m = new FenetreSaisirPersonne(mai);
			m.setVisible(true);
		} else if (((JButton)e.getSource()).getText().equals("Naissance")) {
			FenetreNaissance m = new FenetreNaissance(mai);
			m.setVisible(true);
		}else if (((JButton)e.getSource()).getText().equals("Etat d'une personne")) {
			FenetreAffichage m = new FenetreAffichage(mai);
			m.setVisible(true);
		}else if (((JButton)e.getSource()).getText().equals("Liste des personnes")) {
			FenetreListe m = new FenetreListe(mai);
			m.setVisible(true);
		}else if (((JButton)e.getSource()).getText().equals("Quitter")) {
			 System.exit(0);
			 
		}
    }
}
