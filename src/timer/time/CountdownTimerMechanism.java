package timer.time;

import timer.GUI.elements_services.timer.TimerVisitor;

import java.util.Timer;
import java.util.TimerTask;

public final class CountdownTimerMechanism implements timer.time.Timer {
    private final TimerVisitor visitor;
    private final CountdownTimerWindowInfluencer windowInfluencer;

    private Timer timer;
    private long timeInSeconds;

    public CountdownTimerMechanism(long timeInSeconds, CountdownTimerWindowInfluencer windowInfluencer, TimerVisitor visitor) {
        this.timeInSeconds = timeInSeconds;
        this.windowInfluencer = windowInfluencer;
        this.visitor = visitor;
    }

    @Override
    public void start() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                decrementTime();
            }
        }, 0, 1000);
    }

    @Override
    public void stop() {
        resetTimerToDefault();
    }

    @Override
    public void reset() {
        resetTimer();
    }

    private void decrementTime() {
        if (timeInSeconds == 0) {
            onTimeOver();

            return;
        }
        --timeInSeconds;
        showTime();
    }

    private void onTimeOver() {
        windowInfluencer.resetButtonsToDefault();
        resetTimer();
        visitor.visitCountdownTimer(this);
    }

    private void showTime() {
        windowInfluencer.showTime(timeInSeconds);
    }

    private void resetTimer() {
        windowInfluencer.showTime("00:00:00");
        windowInfluencer.enableAllInputs();

        resetTimerToDefault();
        timeInSeconds = 0;
    }

    public void resetTimerToDefault() {
        timer.cancel();
        timer.purge();
    }

    public long getTimeInSeconds() {
        return timeInSeconds;
    }
}