package timer.GUI.elements_services.buttons.start.validation;

public class ValidationException extends Exception {
    private final String message;

    public ValidationException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
