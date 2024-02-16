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

    @Test
    public void shouldThrowExceptionOnHoursExceed() {
        secondsTimeCalculator = new SecondsTimeCalculator(getConstructor("25", "0", "0"));

        assertThrows(IllegalArgumentException.class, () -> secondsTimeCalculator.calculateTime());
    }

    @Test
    public void shouldThrowExceptionOnTimeExceedBecauseOfMinutes() {
        secondsTimeCalculator = new SecondsTimeCalculator(getConstructor("24", "61", "0"));

        assertThrows(IllegalArgumentException.class, () -> secondsTimeCalculator.calculateTime());
    }

    TimeInputFields getConstructor(String hours, String minutes, String seconds) {
        return new TimeInputFields(new JTextField(hours), new JTextField(minutes), new JTextField(seconds));
    }


}