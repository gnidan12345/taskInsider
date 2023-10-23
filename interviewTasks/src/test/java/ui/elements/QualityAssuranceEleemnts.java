package ui.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class QualityAssuranceEleemnts {
    public SelenideElement seeAllJobsButton() {
        return $x("//a[text()='See all QA jobs']");
    }

    public SelenideElement headingQA() {
        return $x("//h1");
    }

}
