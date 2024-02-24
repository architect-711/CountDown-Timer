package com.countdown_timer.timer.GUI.elements_services.buttons.stop;

import com.countdown_timer.constructores.ButtonClickHandlerParameters;
import com.countdown_timer.constructores.StartButtonText;
import com.countdown_timer.timer.GUI.elements_services.buttons.ButtonClickHandler;

import java.awt.event.ActionEvent;

public class StopButtonClickHandler extends ButtonClickHandler {

    public static StopButtonClickHandler getStopButtonClickHandler(ButtonClickHandlerParameters parameters) {
        return new StopButtonClickHandler(parameters);
    }

    private StopButtonClickHandler(ButtonClickHandlerParameters parameters) {
        super(parameters);
    }

    public void handleClick(ActionEvent actionEvent) {
        getCountdownTimerService().stop();

        getButtons().getSTART_BUTTON().setText(StartButtonText.getSTART_BUTTON_CONTINUE_TEXT());
        getButtons().getSTART_BUTTON().setEnabled(true);
        getButtons().getSTOP_BUTTON().setEnabled(false);
    }
}