package com.countdown_timer.timer.GUI.elements_services.buttons.reset;

import com.countdown_timer.constructores.ButtonClickHandlerParameters;
import com.countdown_timer.timer.GUI.elements_services.buttons.ButtonClickHandler;

import java.awt.event.ActionEvent;

public class ResetButtonClickHandler extends ButtonClickHandler {
    public static ResetButtonClickHandler getResetButtonClickHandler(ButtonClickHandlerParameters parameters) {
        return new ResetButtonClickHandler(parameters);
    }

    private ResetButtonClickHandler(ButtonClickHandlerParameters parameters) {
        super(parameters);
    }

    public void handleClick(ActionEvent actionEvent) {
        influenceOnWindowElements();
        resetTimer();
    }

    private void influenceOnWindowElements() {
        ResetButtonWindowElementsInfluencer.getResetButtonWindowElementsInfluencer(getParameters()).executeDefaultInfluence();
    }

    private void resetTimer() {
        getCountdownTimerService().reset();
    }
}
