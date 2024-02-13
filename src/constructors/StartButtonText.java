package constructors;

import org.apache.commons.lang3.StringUtils;

public class StartButtonText {
    private static final String START_BUTTON_CONTINUE_TEXT = StringUtils.capitalize(StartButtonStates.CONTINUE.name().toLowerCase());
    private static final String START_BUTTON_START_TEXT = StringUtils.capitalize(StartButtonStates.START.name().toLowerCase());

    public static String getSTART_BUTTON_CONTINUE_TEXT() {
        return START_BUTTON_CONTINUE_TEXT;
    }

    public static String getSTART_BUTTON_START_TEXT() {
        return START_BUTTON_START_TEXT;
    }
}
