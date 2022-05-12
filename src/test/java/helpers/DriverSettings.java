package helpers;

import config.Project;
import com.codeborne.selenide.Configuration;

public class DriverSettings {

    public static void configure() {
        Configuration.browser = Project.config.browser();
        Configuration.browserVersion = Project.config.browserVersion();
        Configuration.browserSize = Project.config.browserSize();

        if (Project.isRemoteWebDriver()) {
            Configuration.remote = Project.config.remoteDriverUrl();
        }
    }
}