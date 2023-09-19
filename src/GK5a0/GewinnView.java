package GK5a0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Gewinn View ist fuer alle Grafischen Komponenten zustaendig
 * @author Gustav Glatzel
 * @version 2023-09-19
 */
public class GewinnView extends JFrame {

    private final JTextField spielerEingabe;
    private final JTextField computerZahl;
    private final JLabel punkteGesamt;
    private final JLabel aktuellesErgebnis;
    private final JButton nochEinmalButton;

    /**
     * Konstruktor fuer das GUI das von JFrame erbt
     */
    public GewinnView() {

        super("Gewinnspiel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(700, 300);
        this.setLayout(new BorderLayout());

        JPanel panelOben = new JPanel();
        panelOben.setLayout(new GridLayout(3, 2));

        JLabel punkteGesamtText = new JLabel();
        this.punkteGesamt = new JLabel();
        this.aktuellesErgebnis = new JLabel();
        JLabel aktuellesErgebnisText = new JLabel();
        JLabel zahlFuerNaechsteRundeText = new JLabel();
        this.computerZahl = new JTextField();
        JLabel computerZahlText = new JLabel();
        this.nochEinmalButton = new JButton();
        this.spielerEingabe = new JTextField();

        punkteGesamtText.setText("Punkte gesamt:");
        punkteGesamtText.setHorizontalAlignment(SwingConstants.CENTER);
        punkteGesamtText.setBackground(new Color(213, 213, 213));
        punkteGesamtText.setOpaque(true);
        aktuellesErgebnisText.setText("Aktuelles Ergebnis:");
        aktuellesErgebnisText.setBackground(new Color(213, 213, 213));
        aktuellesErgebnisText.setHorizontalAlignment(SwingConstants.CENTER);
        aktuellesErgebnisText.setOpaque(true);
        this.punkteGesamt.setText("30");
        this.punkteGesamt.setHorizontalAlignment(SwingConstants.CENTER);
        this.aktuellesErgebnis.setText("");
        this.aktuellesErgebnis.setHorizontalAlignment(SwingConstants.CENTER);
        zahlFuerNaechsteRundeText.setText("Zahl für nächste Runde:");
        zahlFuerNaechsteRundeText.setHorizontalAlignment(SwingConstants.CENTER);
        zahlFuerNaechsteRundeText.setBackground(new Color(213, 213, 213));
        zahlFuerNaechsteRundeText.setOpaque(true);
        computerZahlText.setText("Computerzahl:");
        computerZahlText.setHorizontalAlignment(SwingConstants.CENTER);
        computerZahlText.setBackground(new Color(213, 213, 213));
        computerZahlText.setOpaque(true);
        this.computerZahl.setEnabled(false);
        this.nochEinmalButton.setText("Noch einmal!");
        this.nochEinmalButton.setEnabled(false);

        Font font = this.spielerEingabe.getFont();

        this.spielerEingabe.setFont(font.deriveFont((float) this.getHeight() - ((float) this.getHeight() / 2)));
        this.computerZahl.setFont(font.deriveFont((float) this.getHeight() - ((float) this.getHeight() / 2)));
        this.spielerEingabe.setHorizontalAlignment(SwingConstants.CENTER);
        this.spielerEingabe.setOpaque(true);
        this.computerZahl.setHorizontalAlignment(SwingConstants.CENTER);
        this.computerZahl.setOpaque(true);

        panelOben.add(punkteGesamtText);
        panelOben.add(aktuellesErgebnisText);
        panelOben.add(this.punkteGesamt);
        panelOben.add(this.aktuellesErgebnis);
        panelOben.add(zahlFuerNaechsteRundeText);
        panelOben.add(computerZahlText);

        this.add(panelOben, BorderLayout.PAGE_START);

        JPanel eingabePanel = new JPanel(new GridLayout(1, 2));
        eingabePanel.add(spielerEingabe);
        eingabePanel.add(computerZahl);

        this.add(eingabePanel, BorderLayout.CENTER);
        this.add(this.nochEinmalButton, BorderLayout.PAGE_END);

    }

    /**
     * Setter fuer die Gesamtpunkte
     * @param gesamtPunkte Die Gesamtpunkte der Runde
     */
    public void setPunkteGesamt(int gesamtPunkte) {

        if (gesamtPunkte >= 100) {
            this.punkteGesamt.setText("GEWONNEN!");
            this.punkteGesamt.setBackground(new Color(36, 255, 0));
            this.punkteGesamt.setOpaque(true);
            return;
        } else if (gesamtPunkte <= 0) {
            this.punkteGesamt.setText("VERLOREN");
            this.punkteGesamt.setBackground(new Color(255, 0, 0));
            this.punkteGesamt.setOpaque(true);
            return;
        }

        this.punkteGesamt.setText(String.valueOf(gesamtPunkte));

    }

    /**
     * Setzt den Text vom aktuellen Ergebnis Feld auf LEER und faerbt den Hintergrund weiß
     */
    public void resetAktuellesErgebnis() {
        this.aktuellesErgebnis.setText("");
        this.aktuellesErgebnis.setBackground(new Color(255, 255, 255));
    }

    /**
     * Setzt den Text vom Spielerzahl Feld auf nichts
     */
    public void resetSpielerZahl() {
        this.spielerEingabe.setText("");
    }
    /**
     * Setzt den Text vom Computerzahl Feld auf nichts
     */
    public void resetComputerZahl() {
        this.computerZahl.setText("");
    }

    /**
     * Setter fuer das aktuelle Ergebnis
     * @param aktuellesErgebnis Das aktuelle Ergebnis der Runde
     */
    public void setAktuellesErgebnis(int aktuellesErgebnis) {

        if (aktuellesErgebnis >= 0) {
            this.aktuellesErgebnis.setBackground(new Color(36, 255, 0));
        } else {
            this.aktuellesErgebnis.setBackground(new Color(255, 0, 0));
        }
        this.aktuellesErgebnis.setOpaque(true);
        this.aktuellesErgebnis.setText(String.valueOf(aktuellesErgebnis));
    }

    /**
     * Spieler Eingabe aktiviert/deaktiviert Methode
     * @param enabled Ob die Spieler Eingabe aktiviert oder deaktiviert sein soll
     */
    public void setSpielerEingabeEnabled(boolean enabled) {
        this.spielerEingabe.setEnabled(enabled);
    }

    /**
     * Setter fuer die Computerzahl
     * @param computerZahl Welche Zahl der Computer generiert hat
     */
    public void setComputerZahl(int computerZahl) {
        this.computerZahl.setText(String.valueOf(computerZahl));
        this.computerZahl.setDisabledTextColor(new Color(0, 0, 0));
    }

    /**
     * Nocheinmal Button aktiviert/deaktiviert Methode
     * @param enabled Ob der Button aktiviert sein soll
     */
    public void setNochEinmalButtonEnabled(boolean enabled) {
        this.nochEinmalButton.setEnabled(enabled);
    }

    /**
     * Setzt einen Action listener auf dem Noch einmal Button
     * @param listener Action listener
     */
    public void setActionListenerButton(ActionListener listener) {
        this.nochEinmalButton.addActionListener(listener);
    }

    /**
     * Setzt einen Action listener auf dem Spieler Eingabe text-field
     * @param listener Action listener
     */
    public void setActionListenerTextField(ActionListener listener) {
        this.spielerEingabe.addActionListener(listener);
    }

    /**
     * Getter fuer die Spieler Eingabe
     * @return Spieler Eingabe
     */
    public JTextField getSpielerEingabe() {
        return this.spielerEingabe;
    }

}
