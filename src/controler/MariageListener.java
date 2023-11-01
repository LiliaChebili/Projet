package controler;

import model.Mairie;
import view.FenetreMariage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MariageListener implements ActionListener {

    private Mairie mairie;
    private JTextField zoneTexteEpoux;
    private JTextField zoneTexteEpouse;
    private JPanel panel;
    private JLabel felicitationLabel;

    public MariageListener(Mairie m, JTextField h, JTextField f, JPanel pp) {
        mairie = m;
        zoneTexteEpoux = h;
        zoneTexteEpouse = f;
        panel = pp;
        felicitationLabel = new JLabel("Félicitations vous êtes mariés !");
        felicitationLabel.setFont(felicitationLabel.getFont().deriveFont(24.0f));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int idh = Integer.parseInt(zoneTexteEpoux.getText());
        int idf = Integer.parseInt(zoneTexteEpouse.getText());

        if (((JButton) e.getSource()).getText().equals("Marier")) {
            mairie.marierCitoyen(idh, idf);

            panel.removeAll();
            panel.add(felicitationLabel);

            panel.revalidate();
            panel.repaint();

            // Vider les champs
            zoneTexteEpoux.setText("");
            zoneTexteEpouse.setText("");
        }
    }
}
