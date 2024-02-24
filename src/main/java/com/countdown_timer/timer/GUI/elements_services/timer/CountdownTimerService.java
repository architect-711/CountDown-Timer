package com.countdown_timer.timer.GUI.elements_services.timer;

import com.countdown_timer.constructores.CountdownTimerServiceParameters;
import com.countdown_timer.timer.time.CountdownTimerMechanism;
import com.countdown_timer.timer.time.CountdownTimerWindowInfluencer;
import com.countdown_timer.timer.time.SecondsTimeCalculator;

public class CountdownTimerService {
    private final CountdownTimerServiceParameters parameters;
    private CountdownTimerMechanism countdownTimerMechanism;

    public CountdownTimerService(CountdownTimerServiceParameters parameters) {
        this.parameters = parameters;
    }

    public void start() {
        CountdownTimerVisitor visitor = new CountdownTimerVisitor(new SecondsTimeCalculator(parameters.timeFields().timeInputFields()));
        CountdownTimerWindowInfluencer windowInfluencer = new CountdownTimerWindowInfluencer(parameters.timeFields(), parameters.buttons());

        countdownTimerMechanism = new CountdownTimerMechanism(countSecondsTime(), windowInfluencer, visitor);
        countdownTimerMechanism.start();
    }

    private long countSecondsTime() {
        if (countdownTimerMechanism == null || countdownTimerMechanism.getTimeInSeconds() == 0) {
            SecondsTimeCalculator secondsTimeCalculator = new SecondsTimeCalculator(parameters.timeFields().timeInputFields());
            secondsTimeCalculator.calculateTime();

            return secondsTimeCalculator.getSecondsTime();
        }
        return countdownTimerMechanism.getTimeInSeconds();
    }

    public void stop() {
        countdownTimerMechanism.stop();
    }

    public void reset() {
        countdownTimerMechanism.reset();
    }
}
