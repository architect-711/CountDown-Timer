package timer.GUI.elements_services.buttons.reset;

import constructors.StartButtonText;
import constructors.WindowElementsInfluencerParameters;
import timer.GUI.elements_services.buttons.ButtonsWindowElementsInfluencer;
import timer.GUI.elements_services.input.InputTimeFieldsService;

public class ResetButtonWindowElementsInfluencer extends ButtonsWindowElementsInfluencer {
    public static ResetButtonWindowElementsInfluencer getResetButtonWindowElementsInfluencer(WindowElementsInfluencerParameters parameters) {
        return new ResetButtonWindowElementsInfluencer(parameters);
    }

    private ResetButtonWindowElementsInfluencer(WindowElementsInfluencerParameters parameters) {
        super(parameters);
    }

    @Override
    public void executeDefaultInfluence() {
        effectOnInputs();
        changeEnable();
        changeStartButtonText();
    }

    private void effectOnInputs() {
        InputTimeFieldsService inputTimeFieldsService = new InputTimeFieldsService(getTimeInputFields());

        inputTimeFieldsService.clearAllInputs();
        inputTimeFieldsService.insertZerosEverywhere();
        inputTimeFieldsService.setIsEnabledAllFields(true);
    }

    private void changeEnable() {
        getButtons().getRESET_BUTTON().setEnabled(false);
        getButtons().getSTOP_BUTTON().setEnabled(false);
        getButtons().getSTART_BUTTON().setText(StartButtonText.getSTART_BUTTON_START_TEXT());
        getButtons().getSTART_BUTTON().setEnabled(true);
    }

    private void changeStartButtonText() {
        getButtons().getSTART_BUTTON().setText(StartButtonText.getSTART_BUTTON_START_TEXT());
    }
}
