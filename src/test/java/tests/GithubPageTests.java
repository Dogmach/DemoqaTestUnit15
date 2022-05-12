package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

public class GithubPageTests extends TestBase {

    @Test
    void pageTitleTest() {
        open("https://www.github.com");
        $("title").shouldHave(attribute("text",
                "GitHub: Where the world builds software · GitHub"));
    }
}