package org.example.operations;

import org.example.base.OperationsTests;
import org.testng.annotations.Test;

public class SubtractionTests extends OperationsTests {

    @Test(
            groups = { "operations" },
            dependsOnGroups = { "smoke" },
            dataProvider = "ops-data",
            priority = 1
    )
    public void testSubtraction(float a, float b) {
        this.app
                .inputValue1(a)
                .inputValue2(b)
                .clickSubtractButton();

        verifyResult(Float.toString(a - b));
    }
}
