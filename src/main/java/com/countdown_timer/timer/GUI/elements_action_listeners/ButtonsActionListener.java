package com.countdown_timer.timer.GUI.elements_action_listeners;

import com.countdown_timer.constructores.Buttons;
import com.countdown_timer.constructores.TimeFields;
import com.countdown_timer.timer.GUI.elements_services.buttons.ButtonsLogicService;

public class ButtonsActionListener {
    private final Buttons buttons;
    private final ButtonsLogicService buttonsLogicService;

    public ButtonsActionListener(Buttons buttons, TimeFields timeFields) {
        this.buttons = buttons;

        buttonsLogicService = new ButtonsLogicService(buttons, timeFields);
    }

    public void setActionListenersToEachButton() {
        buttons.getSTART_BUTTON().addActionListener(buttonsLogicService::startButtonClick);
        buttons.getSTOP_BUTTON().addActionListener(buttonsLogicService::stopButtonClick);
        buttons.getRESET_BUTTON().addActionListener(buttonsLogicService::resetButtonClick);
    }
}
