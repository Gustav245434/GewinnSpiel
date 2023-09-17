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


            System.out.println("Pressed Nocheinmal Button");

            // Perform Tasks


        }
    }

    private class TextFieldListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println("Pressed Enter in SpielerEingabe TextField");

            // Perform Tasks

        }
    }


}
