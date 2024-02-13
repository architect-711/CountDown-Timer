package timer.GUI.elements_services.buttons.reset;

import constructors.ButtonClickHandlerParameters;
import timer.GUI.elements_services.buttons.ButtonClickHandler;

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
