package GK5a0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GewinnController {

    private GewinnModel model;
    private GewinnView view;

    public GewinnController(GewinnModel model, GewinnView view) {

        this.model = model;
        this.view = view;

        this.view.setActionListenerButton(new ButtonListener());
        this.view.setActionListenerTextField(new TextFieldListener());

        this.view.setVisible(true);

    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            view.setNochEinmalButtonEnabled(false);
            view.setSpielerEingabeEnabled(true);
            view.resetAktuellesErgebnis();
            view.resetComputerZahl();
            view.resetSpielerZahl();

        }
    }

    private class TextFieldListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int spielerEingabe;

            try {
                spielerEingabe = Integer.parseInt(view.getSpielerEingabe().getText());
                view.setSpielerEingabeEnabled(false);
                model.berechneComputerZahl();
                model.berechneRunde(spielerEingabe);
            } catch (NumberFormatException exception) {
                return;
            }

            view.setPunkteGesamt(model.getGesamtPunkte());
            view.setAktuellesErgebnis(model.getRundenErgebnis());
            view.setComputerZahl(model.getComputerZahl());
            view.setNochEinmalButtonEnabled(true);

        }
    }


}
