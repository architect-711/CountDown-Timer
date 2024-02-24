package com.countdown_timer.timer.GUI.elements_services.buttons.start;

import com.countdown_timer.constructores.ButtonClickHandlerParameters;
import com.countdown_timer.timer.GUI.elements_services.buttons.start.validation.TimeInputFieldsValidator;
import com.countdown_timer.timer.GUI.elements_services.buttons.start.validation.ValidationException;
import com.countdown_timer.utils.logger.Logger;
import com.countdown_timer.timer.GUI.elements_services.buttons.ButtonClickHandler;

import java.awt.event.ActionEvent;

public class StartButtonClickHandler extends ButtonClickHandler {
    private final StartButtonWindowElementsInfluencer windowElementsInfluencer;

    public static StartButtonClickHandler getStartButtonClickHandler(ButtonClickHandlerParameters parameters) {
        return new StartButtonClickHandler(parameters);
    }

    private StartButtonClickHandler(ButtonClickHandlerParameters parameters) {
        super(parameters);

        windowElementsInfluencer = StartButtonWindowElementsInfluencer.getEffectOnWindowElements(getParameters());
    }

    public void handleClick(ActionEvent actionEvent) {
        try {
            validate();
            startTimer();
            influenceOnWindowElements();
        } catch (Exception exception) {
            Logger.logException(exception);
        }
    }

    private void validate() throws ValidationException {
        TimeInputFieldsValidator validator = new TimeInputFieldsValidator(windowElementsInfluencer.getTimeInputFields());

        validator.validate();
    }

    private void influenceOnWindowElements() {
        windowElementsInfluencer.executeDefaultInfluence();
    }

    private void startTimer() {
        getCountdownTimerService().start();
    }
}
