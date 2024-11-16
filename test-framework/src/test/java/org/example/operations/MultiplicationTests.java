package org.example.operations;

import org.example.base.OperationsTests;
import org.testng.annotations.Test;

public class MultiplicationTests extends OperationsTests {

    @Test(
            groups = { "operations" },
            dependsOnGroups = { "smoke" },
            dataProvider = "ops-data",
            priority = 2
    )
    public void testMultiplication(float a, float b) {
        this.app
                .inputValue1(a)
                .inputValue2(b)
                .clickMultiplyButton();

        verifyResult(Float.toString(a * b));
    }
}
