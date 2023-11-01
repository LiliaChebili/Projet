package view;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controler.DivorceListener;
import model.Mairie;

public class FenetreDivorce extends JFrame {

    private Mairie mairie;

    public FenetreDivorce(Mairie m) {
        this.mairie = m;

        this.setTitle("Application de gestion des citoyens");
        this.setPreferredSize(new Dimension(500, 500));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JTextField zoneTextePersonne = new JTextField("Identifiant", 20);
        JButton boutonDivorcer = new JButton("Divorcer");

        panel.add(zoneTextePersonne);
        panel.add(boutonDivorcer);

        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);

        DivorceListener divorceListener = new DivorceListener(mairie, zoneTextePersonne, panel);
        boutonDivorcer.addActionListener(divorceListener);
    }
}
