package timer.GUI.elements_services.buttons;

import constructors.Buttons;
import constructors.TimeInputFields;
import constructors.WindowElementsInfluencerParameters;

public abstract class ButtonsWindowElementsInfluencer {
    private final Buttons buttons;
    private final TimeInputFields timeInputFields;

    public ButtonsWindowElementsInfluencer(WindowElementsInfluencerParameters parameters) {
        this.buttons = parameters.buttons();
        this.timeInputFields = parameters.timeInputFields();
    }

    public abstract void executeDefaultInfluence();

    public Buttons getButtons() {
        return buttons;
    }

    public TimeInputFields getTimeInputFields() {
        return timeInputFields;
    }
}
