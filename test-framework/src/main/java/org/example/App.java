/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import static com.codeborne.selenide.Selenide.*;

public class App {

    private final String APP_URL = System.getenv("APP_URL");

    public App openApp() {
        open(APP_URL);
        return this;
    }

    public App inputValue1(float val) {
        $("#input-num1").setValue(Float.toString(val));
        return this;
    }

    public App inputValue2(float val) {
        $("#input-num2").setValue(Float.toString(val));
        return this;
    }

    public void clickAddButton() {
        $("#btn-add").click();
    }

    public void clickSubtractButton() {
        $("#btn-subtract").click();
    }

    public void clickMultiplyButton() {
        $("#btn-multiply").click();
    }

    public void clickDivideButton() {
        $("#btn-divide").click();
    }
}
