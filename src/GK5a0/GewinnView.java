package GK5a0;

import javax.swing.*;
import java.awt.*;

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
        this.aktuellesErgebnisText.setHorizontalAlignment(0);
        this.aktuellesErgebnisText.setOpaque(true);
        this.punkteGesamt.setText("30");
        this.aktuellesErgebnis.setText("");
        this.zahlFuerNaechsteRundeText.setText("Zahl für nächste Runde:");
        this.computerZahlText.setText("Computerzahl:");
        this.computerZahl.setEnabled(false);
        this.nochEinmalButton.setText("Noch einmal!");
        this.nochEinmalButton.setEnabled(false);

        panelOben.add(this.punkteGesamtText);
        panelOben.add(this.aktuellesErgebnisText);
        panelOben.add(this.punkteGesamt);
        panelOben.add(this.aktuellesErgebnis);
        panelOben.add(this.zahlFuerNaechsteRundeText);
        panelOben.add(this.computerZahlText);

        this.add(panelOben, BorderLayout.PAGE_START);
        this.add(this.spielerEingabe, BorderLayout.LINE_START);
        this.add(this.computerZahl, BorderLayout.LINE_END);
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

}
