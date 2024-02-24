package com.countdown_timer.timer.GUI.elements_services.input;

import com.countdown_timer.constructores.TimeInputFields;

import java.util.Arrays;

public class InputTimeFieldsService {
    private final TimeInputFields timeInputFields;

    public InputTimeFieldsService(TimeInputFields timeInputFields) {
        this.timeInputFields = timeInputFields;
    }

    public void setIsEnabledAllFields(boolean enabled) {
        Arrays.stream(timeInputFields.toArray()).forEach(field -> field.setEnabled(enabled));
    }

    public void insertZerosEverywhere() {
        Arrays.stream(timeInputFields.toArray()).forEach(timeInputField -> timeInputField.setText("0"));
    }

    public void insertZerosToBlankFields() {
        Arrays.stream(timeInputFields.toArray()).forEach(inputField -> {
            if (inputField.getText().isBlank())
                inputField.setText("0");
        });
    }

    public void clearAllInputs() {
        Arrays.stream(timeInputFields.toArray()).forEach(inputField -> inputField.setText(""));
    }
}
