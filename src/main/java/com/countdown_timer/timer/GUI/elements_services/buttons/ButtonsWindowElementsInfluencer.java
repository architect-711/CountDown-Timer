package com.countdown_timer.timer.GUI.elements_services.buttons;

import com.countdown_timer.constructores.Buttons;
import com.countdown_timer.constructores.TimeInputFields;
import com.countdown_timer.constructores.WindowElementsInfluencerParameters;

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
