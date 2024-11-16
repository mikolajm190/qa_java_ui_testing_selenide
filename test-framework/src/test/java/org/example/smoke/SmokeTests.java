package org.example.smoke;

import com.codeborne.selenide.Selenide;
import org.example.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class SmokeTests extends BaseTests {

    @Test (groups = { "smoke" })
    public void testPageTitle() {
        assertNotNull(Selenide.title());
    }
}
