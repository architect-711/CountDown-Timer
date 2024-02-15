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
        secondsTimeCalculator = new SecondsTimeCalculator(getConstructor("1", "0", "0"));
        secondsTimeCalculator.calculateTime();

        assertEquals(3600, secondsTimeCalculator.getSecondsTime());
    }

    TimeInputFields getConstructor(String hours, String minutes, String seconds) {
        return new TimeInputFields(new JTextField(hours), new JTextField(minutes), new JTextField(seconds));
    }


}