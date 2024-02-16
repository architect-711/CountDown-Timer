package test.timer.time.GUI.elements_services.buttons.start.validation;

import constructors.TimeInputFields;
import org.junit.jupiter.api.Test;
import timer.GUI.elements_services.buttons.start.validation.TimeInputFieldsValidator;
import timer.GUI.elements_services.buttons.start.validation.ValidationException;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;

public class TimeInputFieldsValidatorTest {
    private TimeInputFieldsValidator validator;

    @Test
    public void shouldThrowException() {
        validator = new TimeInputFieldsValidator(getParameters("", "", ""));

        assertThrows(ValidationException.class, () -> validator.validate());
    }

    private TimeInputFields getParameters(String hours, String minutes, String seconds) {
        return new TimeInputFields(new JTextField(hours), new JTextField(minutes), new JTextField(seconds));
    }
}
