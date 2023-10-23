package ui.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class HomePageElements {

    public SelenideElement mainSection() {
        return $("#navigation");
    }

    public SelenideElement userField() {
        return $("#navbarDropdownMenuLink");
    }

    public SelenideElement companyButton() {
        return $x("(//*[@id=\"navbarDropdownMenuLink\"])[5]");
    }


    public SelenideElement carieerButton() {
        return $x("//a[@href='https://useinsider.com/careers/']");
    }

}
