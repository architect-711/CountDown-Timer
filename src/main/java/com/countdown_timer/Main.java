import utils.logger.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            CountdownTimer countdownTimer = new CountdownTimer();

            countdownTimer.start();
        } catch (Exception exception) {
            Logger.logException(exception);
        }
    }

}