package GK5a0;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class GewinnView extends JFrame {

    private JTextField spielerEingabe;
    private JTextField computerZahl;
    private JLabel punkteGesamtText;
    private JLabel aktuellesErgebnisText;
    private JLabel punkteGesamt;
    private JLabel aktuellesErgebnis;
    private JLabel zahlFuerNaechsteRundeText;
    private JLabel computerZahlText;
    private JButton nochEinmalButton;

    public GewinnView() {

        super("Gewinnspiel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 300);
        this.setLayout(new BorderLayout());

        JPanel panelOben = new JPanel();
        panelOben.setLayout(new GridLayout(3, 2));

        this.punkteGesamtText = new JLabel();
        this.punkteGesamt = new JLabel();
        this.aktuellesErgebnis = new JLabel();
        this.aktuellesErgebnisText = new JLabel();
        this.zahlFuerNaechsteRundeText = new JLabel();
        this.computerZahl = new JTextField();
        this.computerZahlText = new JLabel();
        this.nochEinmalButton = new JButton();
        this.spielerEingabe = new JTextField();

        this.punkteGesamtText.setText("Punkte gesamt:");
        this.punkteGesamtText.setHorizontalAlignment(SwingConstants.CENTER);
        this.punkteGesamtText.setBackground(new Color(213, 213, 213));
        this.punkteGesamtText.setOpaque(true);
        this.aktuellesErgebnisText.setText("Aktuelles Ergebnis:");
        this.aktuellesErgebnisText.setBackground(new Color(213, 213, 213));
        this.aktuellesErgebnisText.setHorizontalAlignment(SwingConstants.CENTER);
        this.aktuellesErgebnisText.setOpaque(true);
        this.punkteGesamt.setText("30");
        this.punkteGesamt.setHorizontalAlignment(SwingConstants.CENTER);
        this.aktuellesErgebnis.setText("");
        this.aktuellesErgebnis.setHorizontalAlignment(SwingConstants.CENTER);
        this.zahlFuerNaechsteRundeText.setText("Zahl für nächste Runde:");
        this.zahlFuerNaechsteRundeText.setHorizontalAlignment(SwingConstants.CENTER);
        this.zahlFuerNaechsteRundeText.setBackground(new Color(213, 213, 213));
        this.zahlFuerNaechsteRundeText.setOpaque(true);
        this.computerZahlText.setText("Computerzahl:");
        this.computerZahlText.setHorizontalAlignment(SwingConstants.CENTER);
        this.computerZahlText.setBackground(new Color(213, 213, 213));
        this.computerZahlText.setOpaque(true);
        this.computerZahl.setEnabled(false);
        this.nochEinmalButton.setText("Noch einmal!");
        this.nochEinmalButton.setEnabled(false);

        Font font = this.spielerEingabe.getFont();
        float f = this.spielerEingabe.getHeight();

        this.spielerEingabe.setFont(font.deriveFont((float) this.getHeight() - (this.getHeight() / 2)));
        this.spielerEingabe.setHorizontalAlignment(SwingConstants.CENTER);
        this.spielerEingabe.setOpaque(true);
        this.computerZahl.setHorizontalAlignment(SwingConstants.CENTER);
        this.computerZahl.setOpaque(true);

        panelOben.add(this.punkteGesamtText);
        panelOben.add(this.aktuellesErgebnisText);
        panelOben.add(this.punkteGesamt);
        panelOben.add(this.aktuellesErgebnis);
        panelOben.add(this.zahlFuerNaechsteRundeText);
        panelOben.add(this.computerZahlText);

        this.add(panelOben, BorderLayout.PAGE_START);

        JPanel eingabePanel = new JPanel(new GridLayout(1, 2));
        eingabePanel.add(spielerEingabe);
        eingabePanel.add(computerZahl);

        this.add(eingabePanel, BorderLayout.CENTER);
        this.add(this.nochEinmalButton, BorderLayout.PAGE_END);

    }

    public void setPunkteGesamt(int gesamtPunkte) {
        this.punkteGesamt.setText(String.valueOf(gesamtPunkte));
    }

    public void setAktuellesErgebnis(int aktuellesErgebnis) {
        this.aktuellesErgebnis.setText(String.valueOf(aktuellesErgebnis));
    }

    public void setSpielerEingabeEnabled(boolean enabled) {
        this.spielerEingabe.setEnabled(enabled);
    }

    public void setComputerZahl(int computerZahl) {
        this.computerZahl.setText(String.valueOf(computerZahl));
    }

    public void setNochEinmalButtonEnabled(boolean enabled) {
        this.nochEinmalButton.setEnabled(enabled);
    }

    public void setActionListenerButton(ActionListener listener) {
        this.nochEinmalButton.addActionListener(listener);
    }

    public void setActionListenerTextField(ActionListener listener) {
        this.spielerEingabe.addActionListener(listener);
    }

    public JButton getNochEinmalButton() {
        return this.nochEinmalButton;
    }

    public JTextField getSpielerEingabe() {
        return this.spielerEingabe;
    }

}
