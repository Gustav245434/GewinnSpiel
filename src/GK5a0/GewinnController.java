package GK5a0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Gewinn Controller verbindet Model und View und ist dafuer zustaendig alle Benutzereingaben zu verarbeiten.
 * @author Gustav Glatzel
 * @version 2023-09-19
 */
public class GewinnController {

    private final GewinnModel model;
    private final GewinnView view;

    /**
     * Konstruktor fuer den Controller. Action listener werden zum View hinzugefuegt
     * @param model Gewinnmodel ist fuer die Logik des Spiels zustaendig
     * @param view Gewinnview ist fuer alle grafischen Komponenten zustaendig
     */
    public GewinnController(GewinnModel model, GewinnView view) {

        this.model = model;
        this.view = view;

        this.view.setActionListenerButton(new ButtonListener());
        this.view.setActionListenerTextField(new TextFieldListener());

        this.view.setVisible(true);

    }

    /**
     * Listener Klasse fuer den nochmal Button
     */
    private class ButtonListener implements ActionListener {
        /**
         * Falls der nochmal Button gedrueckt wird
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            view.setNochEinmalButtonEnabled(false);
            view.setSpielerEingabeEnabled(true);
            view.resetAktuellesErgebnis();
            view.resetComputerZahl();
            view.resetSpielerZahl();

        }
    }

    /**
     * Klasse fuer die Spielereingabe
     */
    private class TextFieldListener implements ActionListener {
        /**
         * Falls im Textfeld ENTER gedrueckt wird
         * @param e the event to be processed
         */
        @Override
        public void actionPerformed(ActionEvent e) {

            int spielerEingabe;

            try {
                spielerEingabe = Integer.parseInt(view.getSpielerEingabe().getText());

                if (spielerEingabe <= 0 || spielerEingabe >= 10) {
                    return;
                }

                view.setSpielerEingabeEnabled(false);
                model.berechneComputerZahl();
                model.berechneRunde(spielerEingabe);
            } catch (NumberFormatException exception) {
                return;
            }

            view.setPunkteGesamt(model.getGesamtPunkte());
            view.setAktuellesErgebnis(model.getRundenErgebnis());
            view.setComputerZahl(model.getComputerZahl());

            if (model.getGesamtPunkte() >= 100 || model.getGesamtPunkte() <= 0) {
                return;
            }

            view.setNochEinmalButtonEnabled(true);

        }
    }


}
