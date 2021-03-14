package com.company.factory;

import com.company.buttons.Button;//importButton class
import com.company.buttons.WindowsButton;//import WindowsButton class

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }//Override createButton method
}