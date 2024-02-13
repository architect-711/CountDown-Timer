package timer.GUI.elements_services.buttons.start.validation;

import constructors.TimeInputFields;
import utils.logger.Logger;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.util.Arrays;
import java.util.stream.IntStream;

public class TimeInputFieldsValidationChecker {
    private final TimeInputFields timeInputFields;
    private final JTextField[] inputs;

    public static TimeInputFieldsValidationChecker getTimeInputFieldsValidator(TimeInputFields timeInputFields) {
        return new TimeInputFieldsValidationChecker(timeInputFields);
    }

    private TimeInputFieldsValidationChecker(TimeInputFields timeInputFields) {
        this.timeInputFields = timeInputFields;
        this.inputs = timeInputFields.toArray();
    }

    public boolean isValid() {
        return !isEvenOneBlank() && doHaveOnlyNumbers() && isSumBiggerThanZero() && doesntInputExceedLimit();
    }

    public boolean isEvenOneBlank() {
        return Arrays.stream(inputs).anyMatch(field -> field.getText().isBlank());
    }

    public boolean doHaveOnlyNumbers() throws NumberFormatException {
        try {
            Arrays.stream(inputs).forEach(field -> Integer.parseInt(field.getText()));

            return true;
        } catch (Exception exception) {
            Logger.logException(exception);

            return false;
        }
    }

    public boolean isSumBiggerThanZero() {
        return getMappedToIntInputs().sum() > 0;
    }

    private IntStream getMappedToIntInputs() {
        return Arrays.stream(inputs).map(JTextComponent::getText).mapToInt(Integer::valueOf);
    }

    public boolean doesntInputExceedLimit() {
        for (JTextField input : inputs) {
            byte currentTimeNumber = Byte.parseByte(input.getText());
            if (currentTimeNumber > 60 || currentTimeNumber < 0) {
                return false;
            }
        }

        return true;
    }
}
