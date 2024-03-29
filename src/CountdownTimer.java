import timer.GUI.GUI;
import timer.GUI.elements_services.window.OnWindowLoadHandler;

public class CountdownTimer {
    private final GUI gui = new GUI();

    public CountdownTimer() {}

    public void start() {
        OnWindowLoadHandler onWindowLoadHandler = new OnWindowLoadHandler(gui);

        gui.drawWindow();
        onWindowLoadHandler.reactOnWindowLoad();
    }

}
