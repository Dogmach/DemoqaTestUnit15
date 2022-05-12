package tests;

import helpers.DriverSettings;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        DriverSettings.configure();
    }

    @AfterEach
    public void addAttachments() {
        Selenide.closeWebDriver();
    }
}