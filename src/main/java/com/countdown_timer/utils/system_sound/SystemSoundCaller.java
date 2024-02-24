package utils.system_sound;

import java.awt.*;

public class SystemSoundCaller {
    public static void callErrorSound() {
        final Runnable runnable =
                (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
        if (runnable != null) runnable.run();
    }
}
