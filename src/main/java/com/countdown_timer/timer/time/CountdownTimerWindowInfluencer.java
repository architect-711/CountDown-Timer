package timer.time;

import constructors.Buttons;
import constructors.StartButtonText;
import constructors.TimeFields;
import timer.GUI.elements_services.input.InputTimeFieldsService;

public class CountdownTimerWindowInfluencer {
    private final InputTimeFieldsService inputTimeFieldsService;
    private final Buttons buttons;
    private final TimeFields timeFields;

    public CountdownTimerWindowInfluencer(TimeFields timeFields, Buttons buttons) {
        this.buttons = buttons;
        this.timeFields = timeFields;

        inputTimeFieldsService = new InputTimeFieldsService(timeFields.timeInputFields());
    }

    public void resetButtonsToDefault() {
        buttons.getSTART_BUTTON().setEnabled(true);
        buttons.getSTART_BUTTON().setText(StartButtonText.getSTART_BUTTON_START_TEXT());

        buttons.getRESET_BUTTON().setEnabled(false);
        buttons.getSTOP_BUTTON().setEnabled(false);
    }

    public void enableAllInputs() {
        inputTimeFieldsService.setIsEnabledAllFields(true);
    }

    public void showTime(long seconds) {
        PrettyTime prettyTime = new PrettyTime(seconds);
        prettyTime.prepareTimeToView();

        timeFields.timeLeft().setText(prettyTime.getPrettyTime());
    }

    public void showTime(String time) {
        timeFields.timeLeft().setText(time);
    }
}
