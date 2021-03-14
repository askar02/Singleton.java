package com.company.buttons;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");//html code for button
        onClick();//calling onclick method
    }

    public void onClick() {//onclick method
        System.out.println("Click! Button says - 'Hello World!'");//action that onClick do
    }
}