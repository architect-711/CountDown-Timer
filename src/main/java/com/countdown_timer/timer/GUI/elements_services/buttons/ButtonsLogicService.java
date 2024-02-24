package com.countdown_timer.timer.GUI.elements_services.buttons;

import com.countdown_timer.constructores.ButtonClickHandlerParameters;
import com.countdown_timer.constructores.Buttons;
import com.countdown_timer.constructores.CountdownTimerServiceParameters;
import com.countdown_timer.constructores.TimeFields;
import com.countdown_timer.timer.GUI.elements_services.buttons.reset.ResetButtonClickHandler;
import com.countdown_timer.timer.GUI.elements_services.buttons.start.StartButtonClickHandler;
import com.countdown_timer.timer.GUI.elements_services.buttons.stop.StopButtonClickHandler;
import com.countdown_timer.timer.GUI.elements_services.timer.CountdownTimerService;

import java.awt.event.ActionEvent;

public class ButtonsLogicService {
    private final ButtonClickHandlerParameters buttonClickHandlerParameters;

    public ButtonsLogicService(Buttons buttons, TimeFields timeFields) {

        CountdownTimerService countdownTimerService = new CountdownTimerService(new CountdownTimerServiceParameters(timeFields, buttons));
        buttonClickHandlerParameters = new ButtonClickHandlerParameters(timeFields.timeInputFields(), buttons, countdownTimerService);
    }

    public void startButtonClick(ActionEvent actionEvent) {
        StartButtonClickHandler.getStartButtonClickHandler(buttonClickHandlerParameters).handleClick(actionEvent);
    }

    public void stopButtonClick(ActionEvent actionEvent) {
        StopButtonClickHandler.getStopButtonClickHandler(buttonClickHandlerParameters).handleClick(actionEvent);
    }

    public void resetButtonClick(ActionEvent actionEvent) {
        ResetButtonClickHandler.getResetButtonClickHandler(buttonClickHandlerParameters).handleClick(actionEvent);
    }

}
