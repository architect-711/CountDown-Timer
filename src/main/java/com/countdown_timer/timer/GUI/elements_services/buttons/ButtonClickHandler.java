package com.countdown_timer.timer.GUI.elements_services.buttons;

import com.countdown_timer.constructores.ButtonClickHandlerParameters;
import com.countdown_timer.constructores.Buttons;
import com.countdown_timer.constructores.TimeInputFields;
import com.countdown_timer.constructores.WindowElementsInfluencerParameters;
import com.countdown_timer.timer.GUI.elements_services.timer.CountdownTimerService;

import java.awt.event.ActionEvent;

public abstract class ButtonClickHandler {
    private final TimeInputFields timeInputFields;
    private final Buttons buttons;
    private final CountdownTimerService countdownTimerService;

    public ButtonClickHandler(ButtonClickHandlerParameters parameters) {
        this.timeInputFields = parameters.timeInputFields();
        this.buttons = parameters.buttons();
        this.countdownTimerService = parameters.countdownTimerService();
    }

    public WindowElementsInfluencerParameters getParameters() {
        return new WindowElementsInfluencerParameters(getButtons(), getTimeInputFields());
    }

    public abstract void handleClick(ActionEvent actionEvent);

    public TimeInputFields getTimeInputFields() {
        return timeInputFields;
    }

    public Buttons getButtons() {
        return buttons;
    }

    public CountdownTimerService getCountdownTimerService() {
        return countdownTimerService;
    }
}