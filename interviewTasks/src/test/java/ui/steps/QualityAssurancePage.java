package ui.steps;

import com.codeborne.selenide.Condition;
import ui.elements.QualityAssuranceEleemnts;

import static com.codeborne.selenide.Selenide.open;

public class QualityAssurancePage extends QualityAssuranceEleemnts {

    public QualityAssurancePage openQualityAssurancePage() {
        open("/careers/quality-assurance/");
        return new QualityAssurancePage();
    }

    public QualityAssurancePage assertHeadingQA() {
        headingQA().shouldBe(Condition.visible);
        return this;
    }

    public QualityAssurancePage clickseeAllJobsButton() {
        seeAllJobsButton().hover().click();
        return this;

    }


}
