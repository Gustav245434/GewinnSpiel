package GK5a0;

/**
 *
 *
 *
 */
public class GewinnModel {

    private int gesamtPunkte;
    private int spielerZahl;
    private int computerZahl;
    private int rundenErgebnis;

    public GewinnModel() {

    }

    public int getRundenErgebnis() {
        return rundenErgebnis;
    }

    public int getGesamtPunkte() {
        return gesamtPunkte;
    }

    public int getComputerZahl() {
        return computerZahl;
    }

    public void berechneComputerZahl() {
        this.computerZahl = (int) (Math.random() * 9 + 1);
    }

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

        this.gesamtPunkte += punkte;

    }
}
