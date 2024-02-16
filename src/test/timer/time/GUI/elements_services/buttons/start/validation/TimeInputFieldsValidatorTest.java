package test.timer.time.GUI.elements_services.buttons.start.validation;

import constructors.TimeInputFields;
import timer.GUI.elements_services.buttons.start.validation.TimeInputFieldsValidator;

import javax.swing.*;

public class TimeInputFieldsValidatorTest {
    private TimeInputFieldsValidator validator;

    private TimeInputFields getParameters(JTextField hours, JTextField minutes, JTextField seconds) {
        return new TimeInputFields(hours, minutes, seconds);
    }
}
