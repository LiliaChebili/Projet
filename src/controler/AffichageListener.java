package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import model.Citoyen;
import model.Mairie;
import view.FenetreAffichage;

public class AffichageListener implements ActionListener {

	Mairie mairie;
	JTextField zoneId;

	public AffichageListener(Mairie mairie, JTextField id) {
	    this.mairie = mairie;
	    this.zoneId = id;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    int idC = Integer.parseInt(zoneId.getText());

	    if (((JButton) e.getSource()).getText().equals("Afficher")) {
	        Citoyen citoyen = mairie.chercherCitoyen(idC);

	        FenetreAffichage fenetreAffichage = (FenetreAffichage) zoneId.getTopLevelAncestor();
	        fenetreAffichage.afficherCitoyen(citoyen);
	    }
	}

}


