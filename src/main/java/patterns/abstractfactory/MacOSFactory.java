package patterns.abstractfactory;

import patterns.Button;
import patterns.MacOSButton;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }
}
