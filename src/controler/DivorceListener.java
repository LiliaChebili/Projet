package controler;

import model.Mairie;
import view.FenetreDivorce;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DivorceListener implements ActionListener {

    private Mairie mairie;
    private JTextField zoneTexteCit;
    private JPanel panel;
    private JLabel messageLabel;

    public DivorceListener(Mairie m, JTextField c, JPanel pp) {
        mairie = m;
        zoneTexteCit = c;
        panel = pp;
        messageLabel = new JLabel("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int idC = Integer.parseInt(zoneTexteCit.getText());

        if (((JButton) e.getSource()).getText().equals("Divorcer")) {
            mairie.divorcerCitoyen(idC);

            messageLabel.setText("Vous êtes divorcé");
            panel.add(messageLabel);
            panel.revalidate();
            panel.repaint();

            // Vider le champ
            zoneTexteCit.setText("");
        }
    }
}
