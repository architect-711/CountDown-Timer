package constructors;

import javax.swing.*;

public record ApplicationJFrameElements(
        JButton start,
        JButton stop,
        JButton reset,
        JPanel panel,
        JTextField hours,
        JTextField minutes,
        JTextField seconds,
        JLabel timeLeft
) {}