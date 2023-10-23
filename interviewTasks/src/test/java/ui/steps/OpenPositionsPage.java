package ui.steps;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import ui.elements.OpenPositionsElements;

import static com.codeborne.selenide.Selenide.switchTo;

public class OpenPositionsPage extends OpenPositionsElements {

    public OpenPositionsPage assertHeadingAllPositions() {
        headingAllOpenPositions().shouldBe(Condition.visible);
        return this;
    }

    public OpenPositionsPage clickAcceptCookie() {

        return this;
    }

    public OpenPositionsPage clickLocationFilter() throws InterruptedException {

        clickFilter().shouldBe(Condition.visible);
        DepartmentFilter().shouldBe(Condition.visible);
        Thread.sleep(5000);
        clickFilter().scrollIntoView(true);
        clickFilter().click();
        selectLocation().click();
        jobList().shouldBe(Condition.visible);
        jobBlocksDepartment().shouldHave(Condition.text("Quality Assurance"));
        Thread.sleep(5000);
        jobBlocksLocation().shouldHave(Condition.text("Istanbul, Turkey"));


        return this;
    }


    public OpenPositionsPage clickViewRoleButton() {
        acceptCookiesButton().click();
        jobBlockElement().scrollIntoView(true);
        viewRoleButton().hover().click();
        switchTo().window(1);
        return this;
    }

}
