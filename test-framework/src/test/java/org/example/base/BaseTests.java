package org.example.base;

import org.example.App;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    protected App app;

    @BeforeClass
    public void setUp() {
        this.app = new App().openApp();
    }
}
