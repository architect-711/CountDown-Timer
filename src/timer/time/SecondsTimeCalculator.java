package timer.time;

import constructors.TimeInputFields;
import utils.system_sound.SystemSoundCaller;

public class SecondsTimeCalculator {
    private final TimeInputFields timeInputFields;
    private long secondsTime;
    private TimeFieldsValueConverter timeFieldsValueConverter;

    public SecondsTimeCalculator(TimeInputFields timeInputFields) {
        this.timeInputFields = timeInputFields;

        timeFieldsValueConverter = new TimeFieldsValueConverter(timeInputFields);
    }

    public void calculateTime() {
        parseTimeFieldsText();
        countTimeByFormula();
    }

    private void parseTimeFieldsText() {
        timeFieldsValueConverter.parseTimeFieldsText();
    }

    private void countTimeByFormula() {
        secondsTime = (timeFieldsValueConverter.getHours() * 60 * 60) +
                (timeFieldsValueConverter.getMinutes() * 60) + timeFieldsValueConverter.getSeconds();

        checkoutDayLimitExceeding();
    }

    private void checkoutDayLimitExceeding() {
        final int SECONDS_IN_DAY = 86_400;
        if (secondsTime > SECONDS_IN_DAY) {
            SystemSoundCaller.callErrorSound();
            throw new IllegalArgumentException("Time in seconds exceeds seconds in day");
        }
    }

    public long getSecondsTime() {
        return secondsTime;
    }
}
