package com.appdhome.factories;
import com.appdhome.checkboxes.Checkbox;
import com.appdhome.checkboxes.WindowsCheckbox;
import com.appdhome.buttons.WindowsButton;



public class WindowsFactory implements GUIFactory {

    @Override
    public WindowsButton createButton() {
     return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
