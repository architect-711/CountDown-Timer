package timer.GUI;

import javax.swing.*;

public class GUI extends JFrame {
    private JButton start;
    private JButton stop;
    private JButton reset;
    private JPanel panel;
    private JTextField hours;
    private JTextField minutes;
    private JTextField seconds;
    private JLabel timeLeft;

    public GUI() {}

    public void drawWindow() {
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Architect Timer");
        this.pack();
        this.setVisible(true);
    }

    public JButton getStart() {
        return start;
    }

    public void setStart(JButton start) {
        this.start = start;
    }

    public JButton getStop() {
        return stop;
    }

    public void setStop(JButton stop) {
        this.stop = stop;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getHours() {
        return hours;
    }

    public void setHours(JTextField hours) {
        this.hours = hours;
    }

    public JTextField getMinutes() {
        return minutes;
    }

    public void setMinutes(JTextField minutes) {
        this.minutes = minutes;
    }

    public JTextField getSeconds() {
        return seconds;
    }

    public void setSeconds(JTextField seconds) {
        this.seconds = seconds;
    }

    public JLabel getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(JLabel timeLeft) {
        this.timeLeft = timeLeft;
    }
}
