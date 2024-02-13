package timer.GUI.elements_services.buttons.start.validation;

import constructors.TimeInputFields;
import timer.GUI.elements_services.input.InputTimeFieldsService;

public class TimeInputFieldsValidator {
    private final TimeInputFields timeInputFields;
    private final TimeInputFieldsValidationChecker validationChecker;

    public TimeInputFieldsValidator(TimeInputFields timeInputFields) {
        this.timeInputFields = timeInputFields;
        this.validationChecker = TimeInputFieldsValidationChecker.getTimeInputFieldsValidator(timeInputFields);
    }

    public void validate() throws ValidationException {
        if (!validationChecker.isValid()) {
            tryToMakeValid();
        }

        if (!validationChecker.isValid()) {
            throw new ValidationException("Impossible to validate.");
        }
    }

    private void tryToMakeValid() {
        InputTimeFieldsService inputService = new InputTimeFieldsService(timeInputFields);

        inputService.insertZerosToBlankFields();
    }
}
