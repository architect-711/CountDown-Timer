package timer.time;

public class PrettyTime {

    private String prettyTime;
    private final long secondsTime;
    private long hours;
    private long minutes;
    private long seconds;

    public PrettyTime(long secondsTime) {
        this.secondsTime = secondsTime;
    }

    public void prepareTimeToView() {
        if (secondsTime < 0)
            throw new IllegalArgumentException("Seconds time is less than 0");

        countTime();
        makePrettyTime();
    }

    private void countTime() {
        countHours();
        countMinutes();
        countSeconds();
    }

    private void countHours() {
        hours = (long) Math.floor((double) secondsTime / 3600);
    }

    private void countMinutes() {
        minutes = (long) Math.floor((double) (secondsTime % 3600) / 60);
    }

    private void countSeconds() {
        seconds = (long) Math.floor((double) secondsTime % 60);
    }

    private void makePrettyTime() {
        String displayHours   = hours   > 9 ? String.valueOf(hours)   : "0" + hours;
        String displayMinutes = minutes > 9 ? String.valueOf(minutes) : "0" + minutes;
        String displaySeconds = seconds > 9 ? String.valueOf(seconds) : "0" + seconds;

        prettyTime = String.format("%s:%s:%s", displayHours, displayMinutes, displaySeconds);
    }

    public String getPrettyTime() {
        return prettyTime;
    }

}
