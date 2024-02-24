package com.countdown_timer.timer.GUI.elements_services.timer;

import com.countdown_timer.timer.time.CountdownTimerMechanism;

public interface TimerVisitor {
    void visitCountdownTimer(CountdownTimerMechanism timer);
}
