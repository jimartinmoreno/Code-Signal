package patterns.abstractfactory;

import patterns.Button;
import patterns.WindowsButton;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
