package timer.GUI.elements_services.buttons.start;

import constructors.WindowElementsInfluencerParameters;
import timer.GUI.elements_services.buttons.ButtonsWindowElementsInfluencer;

import java.util.Arrays;

public class StartButtonWindowElementsInfluencer extends ButtonsWindowElementsInfluencer {
    public static StartButtonWindowElementsInfluencer getEffectOnWindowElements(WindowElementsInfluencerParameters parameters) {
        return new StartButtonWindowElementsInfluencer(parameters);
    }

    private StartButtonWindowElementsInfluencer(WindowElementsInfluencerParameters parameters) {
        super(parameters);
    }

    @Override
    public void executeDefaultInfluence() {
        disableAllInputs();
        disableStartButton();
        enableStopAndResetButtons();
    }

    private void disableAllInputs() {
        Arrays.stream(getTimeInputFields().toArray()).forEach(field -> field.setEnabled(false));
    }

    private void disableStartButton() {
        getButtons().getSTART_BUTTON().setEnabled(false);
    }

    private void enableStopAndResetButtons() {
        getButtons().getSTOP_BUTTON().setEnabled(true);
        getButtons().getRESET_BUTTON().setEnabled(true);
    }
}
