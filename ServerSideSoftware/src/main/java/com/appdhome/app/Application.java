package com.appdhome.app;


import com.appdhome.buttons.Button;
import com.appdhome.checkboxes.Checkbox;
import com.appdhome.factories.GUIFactory;



public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = (Button) factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
