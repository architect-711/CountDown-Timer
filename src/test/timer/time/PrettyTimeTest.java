package test.timer.time;

import constructors.TimeInputFields;
import org.junit.jupiter.api.Test;
import timer.time.PrettyTime;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.*;

class PrettyTimeTest {
    private PrettyTime prettyTime;

    @Test
    public void shouldNotThrowException() {
        prettyTime = new PrettyTime(0);

        assertDoesNotThrow(() -> prettyTime.prepareTimeToView());
    }

    @Test
    public void shouldReturnHour() {
        prettyTime = new PrettyTime(3600);

        assertEquals(prettyTime.getPrettyTime(), "01:00:00");
    }

    @Test
    public void shouldReturnHour30Minutes10seconds() {
        prettyTime = new PrettyTime(5410);
        prettyTime.prepareTimeToView();

        assertEquals("01:30:10", prettyTime.getPrettyTime());
    }

    private TimeInputFields getParameters(String hours, String minutes, String seconds) {
        return new TimeInputFields(new JTextField(hours), new JTextField(minutes), new JTextField(seconds));
    }
}