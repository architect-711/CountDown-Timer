package timer.GUI.elements_services.timer;

import timer.time.CountdownTimerMechanism;

public interface TimerVisitor {
    void visitCountdownTimer(CountdownTimerMechanism timer);
}
