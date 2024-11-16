package org.example.base;

import org.testng.annotations.DataProvider;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;

public class OperationsTests extends BaseTests {

    protected void verifyResult(String res) {
        if (res.endsWith(".0")) res = res.substring(0, res.length() - 2);
        $("#result").shouldHave(exactText(res));
    }

    @DataProvider(name = "ops-data")
    public Object[][] createTestData() {
        return new Object[][] {
                { 100   ,   20      },
                { 100   ,   -20     },
                { -100  ,   -20     },
                { 4.0F  ,   0.25F   },
                //{ 100   ,   0       },
                { 100   ,   1       }
        };
    }
}
