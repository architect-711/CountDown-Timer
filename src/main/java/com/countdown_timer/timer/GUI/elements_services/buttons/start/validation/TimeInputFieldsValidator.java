package com.countdown_timer.timer.GUI.elements_services.buttons.start.validation;

import com.countdown_timer.constructores.TimeInputFields;
import com.countdown_timer.utils.system_sound.SystemSoundCaller;
import com.countdown_timer.timer.GUI.elements_services.input.InputTimeFieldsService;

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
            SystemSoundCaller.callErrorSound();
            throw new ValidationException("Impossible to validate.");
        }
    }

    private void tryToMakeValid() {
        InputTimeFieldsService inputService = new InputTimeFieldsService(timeInputFields);

        inputService.insertZerosToBlankFields();
    }
}
