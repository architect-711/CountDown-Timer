package com.countdown_timer.utils.logger;

public class Logger {
    public static void logException(Exception externalException) {
        log(LogExceptionFormatter.getFormattedExceptionMessage(externalException));
    }

    public static void log(String message) {
        System.out.println(message);
    }
}
