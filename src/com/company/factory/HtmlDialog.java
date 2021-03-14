package com.company.factory;

import com.company.buttons.Button;//import Button class
import com.company.buttons.HtmlButton;//import HtmlButton class

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }//override createButton method
}