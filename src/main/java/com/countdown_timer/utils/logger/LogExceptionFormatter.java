package com.countdown_timer.utils.logger;

public class LogExceptionFormatter {
    public static String getFormattedExceptionMessage(Exception exception) {
        return String.format("[ERROR] Message: %s Because: %s Class: %s Stacktrace: \n%s",
                exception.getMessage(), exception.getCause(), exception.getClass().getSimpleName(), getFormattedStackTrace(exception.getStackTrace()));
    }

    public static String getFormattedStackTrace(StackTraceElement[] stackTrace) {
        StringBuilder formattedStackTrace = new StringBuilder();

        for (byte index = 0; index < 5; index++) {
            StackTraceElement stackTraceElement = stackTrace[index];
            String stackTraceConsoleLine = String.format("        %s\n", stackTraceElement.toString());

            formattedStackTrace.append(stackTraceConsoleLine);
        }

        return formattedStackTrace.toString();
    }
}
