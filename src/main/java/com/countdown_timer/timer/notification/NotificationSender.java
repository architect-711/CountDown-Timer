package timer.notification;

import utils.system_sound.SystemSoundCaller;

import java.awt.*;

public final class NotificationSender {
    public static void send(String title, String content) throws IllegalAccessException, AWTException {
        if (!SystemTray.isSupported()) {
            SystemSoundCaller.callErrorSound();
            throw new IllegalAccessException("System tray doesn't supported!");
        }
        displayMessage(title, content);
    }

    private static void displayMessage(String title, String content) throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();
        Image image = Toolkit.getDefaultToolkit().createImage("");
        TrayIcon trayIcon = new TrayIcon(image);

        tray.add(trayIcon);
        trayIcon.displayMessage(title, content, TrayIcon.MessageType.INFO);
    }
}
