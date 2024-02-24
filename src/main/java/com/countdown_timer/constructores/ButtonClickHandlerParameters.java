package com.countdown_timer.constructores;


import com.countdown_timer.timer.GUI.elements_services.timer.CountdownTimerService;

public record ButtonClickHandlerParameters(
        TimeInputFields timeInputFields,
        Buttons buttons,
        CountdownTimerService countdownTimerService
) {}
