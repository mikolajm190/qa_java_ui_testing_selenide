package org.example.operations;

import org.example.base.OperationsTests;
import org.testng.annotations.Test;

public class DivisionTests extends OperationsTests {

    @Test(
            groups = { "operations" },
            dependsOnGroups = { "smoke" },
            dataProvider = "ops-data",
            priority = 3
    )
    public void testDivision(float a, float b) {
        this.app
                .inputValue1(a)
                .inputValue2(b)
                .clickDivideButton();

        verifyResult(Float.toString(a / b));
    }
}
