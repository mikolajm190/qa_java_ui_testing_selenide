package org.example.operations;

import org.example.base.OperationsTests;
import org.testng.annotations.Test;

public class AdditionTests extends OperationsTests {

    @Test(
            groups = { "operations" },
            dependsOnGroups = { "smoke" },
            dataProvider = "ops-data",
            priority = 0
    )
    public void testAddition(float a, float b) {
        this.app
                .inputValue1(a)
                .inputValue2(b)
                .clickAddButton();

        verifyResult(Float.toString(a + b));
    }
}
