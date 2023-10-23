package ui.tests;

import com.codeborne.selenide.Configuration;

import io.netty.handler.codec.http.cookie.Cookie;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ui.steps.MainPage;

import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static utils.EnvProperties.BASE_URL;

public class BaseTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        Configuration.baseUrl = BASE_URL;
        Configuration.headless = false;
        Configuration.browserSize = "2100x1080";

    }

    @AfterMethod(alwaysRun = true)
    public void cleanup() {
        closeWebDriver();
    }
}






