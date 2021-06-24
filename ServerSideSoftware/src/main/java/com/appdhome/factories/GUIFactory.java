package com.appdhome.factories;
import com.appdhome.buttons.WindowsButton;
import com.appdhome.checkboxes.Checkbox;


public interface GUIFactory {
    WindowsButton createButton();
    Checkbox createCheckbox();
}
