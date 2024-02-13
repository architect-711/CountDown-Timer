package timer.GUI.elements_services.buttons;

import constructors.ButtonClickHandlerParameters;
import constructors.Buttons;
import constructors.CountdownTimerServiceParameters;
import constructors.TimeFields;
import timer.GUI.elements_services.buttons.reset.ResetButtonClickHandler;
import timer.GUI.elements_services.buttons.start.StartButtonClickHandler;
import timer.GUI.elements_services.buttons.stop.StopButtonClickHandler;
import timer.GUI.elements_services.timer.CountdownTimerService;

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
