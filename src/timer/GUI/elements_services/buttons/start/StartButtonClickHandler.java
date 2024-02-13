package timer.GUI.elements_services.buttons.start;

import constructors.ButtonClickHandlerParameters;
import timer.GUI.elements_services.buttons.ButtonClickHandler;
import timer.GUI.elements_services.buttons.start.validation.TimeInputFieldsValidator;
import timer.GUI.elements_services.buttons.start.validation.ValidationException;
import utils.logger.Logger;

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
