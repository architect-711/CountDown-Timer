package timer.GUI.elements_services.timer;

import timer.notification.NotificationSender;
import timer.time.CountdownTimerMechanism;
import timer.time.PrettyTime;
import timer.time.SecondsTimeCalculator;
import utils.logger.Logger;

import java.awt.*;

public class CountdownTimerVisitor implements TimerVisitor {
    private final SecondsTimeCalculator secondsTimeCalculator;
    private String userTimeConfiguration;

    public CountdownTimerVisitor(SecondsTimeCalculator secondsTimeCalculator) {
        this.secondsTimeCalculator = secondsTimeCalculator;
    }

    @Override
    public void visitCountdownTimer(CountdownTimerMechanism timer) {
        try {
            defineUserTimerConfiguration();
            sendNotification();
        } catch (Exception exception) {
            Logger.logException(exception);
        }
    }

    private void defineUserTimerConfiguration() {
        secondsTimeCalculator.calculateTime();
        PrettyTime prettyTime = new PrettyTime(secondsTimeCalculator.getSecondsTime());
        prettyTime.prepareTimeToView();

        userTimeConfiguration = prettyTime.getPrettyTime();
    }

    private void sendNotification() throws IllegalAccessException, AWTException {
        NotificationSender.send("Time is up!", String.format("Your timer %s is over.", userTimeConfiguration));
    }
}
