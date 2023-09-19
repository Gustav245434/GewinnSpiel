package GK5a0;

/**
 * Model ist fuer die Logik hinter dem Spiel zustaendig
 * @author Gustav Glatzel
 * @version 2023-09-19
 */
public class GewinnModel {

    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    /**
     * Konstruktor der die Gesamtpunkte auf 30 setzt
     */
    public GewinnModel() {
        this.gesamtPunkte = 30;
    }

    /**
     * Getter fuer das Rundenergebnis
     * @return Das Ergebnis der Runde
     */
    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    /**
     * Getter fuer die Gesamtpunkte
     * @return Die gesamten Punkte aller Runde
     */
    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    /**
     * Getter fuer die Computerzahl
     * @return Die Zahl die der Computer generiert hat
     */
    public int getComputerZahl() {
        return computerZahl;
    }
    /**
     * Methode berechnet fuer die Computerzahl eine zufaellige Zahl zwischen 1 und 9
     */
    public void berechneComputerZahl() {
        this.computerZahl = (int) (Math.random() * 9 + 1);
    }

    /**
     * Berechnet das Runden und Gesamtergebnis fuer eine Runde
     * @param spielerZahl Welcher Zahl der Spieler getippt hat
     */
    public void berechneRunde(int spielerZahl) {

        this.spielerZahl = spielerZahl;

        int punkte;

        if (spielerZahl == this.computerZahl) {
            punkte = 20;
        } else if (spielerZahl - 1 == this.computerZahl || spielerZahl + 1 == this.computerZahl) {
            punkte = 5;
        } else {
            punkte = -10;
        }

        this.rundenErgebnis = punkte;
        this.gesamtPunkte += punkte;

    }
}
