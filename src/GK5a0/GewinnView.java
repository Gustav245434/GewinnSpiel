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
        this.computerZahl.setFont(font.deriveFont((float) this.getHeight() - (this.getHeight() / 2)));
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

        if (gesamtPunkte >= 100) {
            this.punkteGesamt.setText("GEWONNEN!");
            this.punkteGesamt.setBackground(new Color(36, 255, 0));
            return;
        } else if (gesamtPunkte <= 0) {
            this.punkteGesamt.setText("VERLOREN");
            this.punkteGesamt.setBackground(new Color(255, 0, 0));
            return;
        }

        this.punkteGesamt.setText(String.valueOf(gesamtPunkte));

    }

    public void resetAktuellesErgebnis() {
        this.aktuellesErgebnis.setText("");
        this.aktuellesErgebnis.setBackground(new Color(255, 255, 255));
    }
    public void resetSpielerZahl() {
        this.spielerEingabe.setText("");
    }

    public void resetComputerZahl() {
        this.computerZahl.setText("");
    }

    public void setAktuellesErgebnis(int aktuellesErgebnis) {

        if (aktuellesErgebnis >= 0) {
            this.aktuellesErgebnis.setBackground(new Color(36, 255, 0));
        } else {
            this.aktuellesErgebnis.setBackground(new Color(255, 0, 0));
        }
        this.aktuellesErgebnis.setOpaque(true);
        this.aktuellesErgebnis.setText(String.valueOf(aktuellesErgebnis));
    }

    public void setSpielerEingabeEnabled(boolean enabled) {
        this.spielerEingabe.setEnabled(enabled);
    }

    public void setComputerZahl(int computerZahl) {
        this.computerZahl.setText(String.valueOf(computerZahl));
        this.computerZahl.setDisabledTextColor(new Color(0, 0, 0));
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
