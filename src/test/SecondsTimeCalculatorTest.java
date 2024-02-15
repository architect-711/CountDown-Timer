package test;

import constructors.TimeInputFields;
import org.junit.jupiter.api.Test;
import timer.time.SecondsTimeCalculator;
import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;

public class SecondsTimeCalculatorTest {
    private SecondsTimeCalculator secondsTimeCalculator;

    @Test
    public void shouldReturn3600() {
        secondsTimeCalculator = new SecondsTimeCalculator(getConstructor());
        secondsTimeCalculator.calculateTime();

        assertEquals(3600, secondsTimeCalculator.getSecondsTime());
    }

    TimeInputFields getConstructor() {
        JTextField hours = new JTextField("1");
        JTextField minutes = new JTextField("0");
        JTextField seconds = new JTextField("0");

        return new TimeInputFields(hours, minutes, seconds);
    }


}