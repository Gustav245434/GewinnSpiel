package GK5a0;

/**
 * Klasse zum Ausführen des GewinnSpiels
 * wie das Spiel funktioniert:
 * <p>
 * Gegeben ist folgendes Gewinnspiel. Jeder startet mit 30 Punkten. Der/die SpielerIn kann eine Zahl von 1 bis 9 eingeben, der Computer ermittelt zufaellig eine Zahl im gleichen Bereich:
 * <p>
 * Der/die SpielerIn hat genau die gleiche Zahl getippt wie der Computer: Der/die SpielerIn bekommt 20 Punkte zu dem Gesamtpunktestand dazu.
 * Der/die SpielerIn hat eine Zahl getippt, die um 1 größer oder kleiner ist als die des Computers: Der/die SpielerIn bekommt 5 Punkte zu dem Gesamtpunktestand dazu
 * Der/die SpielerIn hat eine andere Zahl getippt: Der/die SpielerIn bekommt 10 Punkte von dem Gesamtpunktestand abgezogen.
 * Wenn man 100 erreicht, hat man gewonnen bei 0 oder weniger, hat man verloren.
 * <p>
 * @author Gustav Glatzel
 * @version 2023-09-19
 */
public class GewinnSpiel {
    /**
     * Main Methode die Model, View und Controller miteinander verbindet.
     * @param args Kein Nutzen
     */
    public static void main(String[] args) {
        GewinnView view = new GewinnView();
        GewinnModel model = new GewinnModel();
        new GewinnController(model, view);
    }

}
