package constructors;

import javax.swing.*;

public class Buttons {
    private final JButton START_BUTTON;
    private final JButton STOP_BUTTON;
    private final JButton RESET_BUTTON;

    public Buttons(JButton startButton, JButton stopButton, JButton resetButton) {
        this.START_BUTTON = startButton;
        this.STOP_BUTTON = stopButton;
        this.RESET_BUTTON = resetButton;
    }

    public JButton getSTART_BUTTON() {
        return START_BUTTON;
    }

    public JButton getSTOP_BUTTON() {
        return STOP_BUTTON;
    }

    public JButton getRESET_BUTTON() {
        return RESET_BUTTON;
    }
}
