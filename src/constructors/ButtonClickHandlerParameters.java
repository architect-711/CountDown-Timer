package constructors;

import timer.GUI.elements_services.timer.CountdownTimerService;

public record ButtonClickHandlerParameters(
        TimeInputFields timeInputFields,
        Buttons buttons,
        CountdownTimerService countdownTimerService
) {}
