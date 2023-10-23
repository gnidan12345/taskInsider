package ui.steps;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import ui.elements.HomePageElements;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class MainPage extends HomePageElements {

    public MainPage openHomePage(){
        open("");
        return new MainPage();
    }

    public MainPage assertUlr(){
        Assert.assertEquals(url(), "https://useinsider.com/" );
        return this;
    }

    public MainPage assertNavigationIsVisible(){
        mainSection().shouldBe(Condition.visible);
        return this;
    }

    public CareersPage clickCompanyButton(){
        companyButton().click();
        carieerButton().click();
        return new CareersPage();

    }


}
