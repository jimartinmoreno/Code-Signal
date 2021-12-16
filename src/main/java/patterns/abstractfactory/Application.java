package patterns.abstractfactory;

import patterns.Button;

public class Application {
    private Button button;

    public Application(GUIFactory factory) {
        button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}
