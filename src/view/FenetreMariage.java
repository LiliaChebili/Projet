package view;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controler.MariageListener;
import model.Mairie;

public class FenetreMariage extends JFrame {

    private Mairie mairie;

    public FenetreMariage(Mairie m) {
        this.mairie = m;

        this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JTextField zoneTexteEpoux = new JTextField("Identifiant Epoux", 20);
        JTextField zoneTexteEpouse = new JTextField("Identifiant Epouse", 20);
        JButton boutonMarier = new JButton("Marier");

        panel.add(zoneTexteEpoux);
        panel.add(zoneTexteEpouse);
        panel.add(boutonMarier);

        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);

        MariageListener mariageListener = new MariageListener(mairie, zoneTexteEpoux, zoneTexteEpouse, panel);
        boutonMarier.addActionListener(mariageListener);
    }
}
