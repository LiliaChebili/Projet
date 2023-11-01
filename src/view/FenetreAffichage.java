package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controler.AffichageListener;
import model.Citoyen;
import model.Mairie;

public class FenetreAffichage extends JFrame {

    private Mairie mairie;
    private JLabel labelInfos;

    public FenetreAffichage(Mairie mairie) {
        this.mairie = mairie;

        this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);

        JTextField zoneIdentifiant = new JTextField("Identifiant", 20);
        zoneIdentifiant.setPreferredSize(new Dimension(200, 30));

        JButton boutonAfficher = new JButton("Afficher");
        boutonAfficher.setPreferredSize(new Dimension(100, 30));
        boutonAfficher.setBackground(Color.BLUE);
        boutonAfficher.setForeground(Color.WHITE);

        panel.add(zoneIdentifiant);
        panel.add(boutonAfficher);

        // Création du JLabel pour afficher les informations du citoyen
        labelInfos = new JLabel("");
        labelInfos.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(labelInfos);

        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);

        AffichageListener affichageListener = new AffichageListener(mairie, zoneIdentifiant);
        boutonAfficher.addActionListener(affichageListener);
    }

    // Méthode pour afficher les informations du citoyen
    public void afficherCitoyen(Citoyen citoyen) {
        if (citoyen != null) {
            String infos = "<html><body><b>Informations du citoyen:</b><br/>" +
                    "<b>Identifiant:</b> " + citoyen.getIdentifiant() + "<br/>" +
                    "<b>Nom:</b> " + citoyen.getNom() + "<br/>" +
                    "<b>Prénom:</b> " + citoyen.getPrenom() + "<br/>" +
                    "<b>Date de naissance:</b> " + citoyen.getDateDeNaissance() + "</body></html>";

            labelInfos.setText(infos);
            labelInfos.setForeground(Color.BLACK);
        } else {
            labelInfos.setText("Aucun citoyen trouvé avec cet identifiant.");
            labelInfos.setForeground(Color.RED);
        }
    }
}
