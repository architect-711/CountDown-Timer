package timer.time;

import constructors.TimeInputFields;

public class TimeFieldsValueConverter {
    private final TimeInputFields timeInputFields;

    private long hours;
    private long minutes;
    private long seconds;

    public TimeFieldsValueConverter(TimeInputFields timeInputFields) {
        this.timeInputFields = timeInputFields;
    }

    public void parseTimeFieldsText() {
        hours   = Long.parseLong(timeInputFields.hours().getText());
        minutes = Long.parseLong(timeInputFields.minutes().getText());
        seconds = Long.parseLong(timeInputFields.seconds().getText());
    }

    public long getHours() {
        return hours;
    }

    public long getMinutes() {
        return minutes;
    }

    public long getSeconds() {
        return seconds;
    }
}
