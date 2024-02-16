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

    @Test
    public void shouldInsertZeros() {
        TimeInputFields fields = getParameters("", "", "1");
        validator = new TimeInputFieldsValidator(fields);

        assertDoesNotThrow(() -> {
            validator.validate();

            assertEquals("0", fields.hours().getText());
            assertEquals("0", fields.minutes().getText());
        });
    }

    private TimeInputFields getParameters(String hours, String minutes, String seconds) {
        return new TimeInputFields(new JTextField(hours), new JTextField(minutes), new JTextField(seconds));
    }
}
