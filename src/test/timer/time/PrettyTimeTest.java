package test.timer.time;

import constructors.TimeInputFields;

import javax.swing.*;

class PrettyTimeTest {

    private TimeInputFields getParameters(String hours, String minutes, String seconds) {
        return new TimeInputFields(new JTextField(hours), new JTextField(minutes), new JTextField(seconds));
    }
}