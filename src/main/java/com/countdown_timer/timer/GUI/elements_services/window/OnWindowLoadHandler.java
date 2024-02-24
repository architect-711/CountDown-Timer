package com.countdown_timer.timer.GUI.elements_services.window;

import com.countdown_timer.constructores.Buttons;
import com.countdown_timer.constructores.TimeFields;
import com.countdown_timer.constructores.TimeInputFields;
import com.countdown_timer.timer.GUI.GUI;
import com.countdown_timer.timer.GUI.elements_action_listeners.ButtonsActionListener;

public class OnWindowLoadHandler {
    private final TimeFields timeFields;
    private final Buttons buttons;

    public OnWindowLoadHandler(GUI gui) {
        timeFields = new TimeFields(
                new TimeInputFields(gui.getHours(), gui.getMinutes(), gui.getSeconds()),
                gui.getTimeLeft()
        );
        buttons = new Buttons(gui.getStart(), gui.getStop(), gui.getReset());
    }

    public void reactOnWindowLoad() {
        setButtonsListeners();
    }

    private void setButtonsListeners() {
        ButtonsActionListener buttonsActionsListener = new ButtonsActionListener(buttons, timeFields);
        buttonsActionsListener.setActionListenersToEachButton();
    }
}
