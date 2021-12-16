package patterns.factorymethod;


import patterns.Button;

public abstract class Dialog {

    abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.paint();
    }
}
