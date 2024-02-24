package com.countdown_timer.constructores;

import javax.swing.*;

public record TimeInputFields(JTextField hours, JTextField minutes, JTextField seconds) {
    public JTextField[] toArray() {
        return new JTextField[] { hours(), minutes(), seconds() };
    }
}
