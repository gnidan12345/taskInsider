package ui.tests;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.steps.OpenPositionsPage;
import ui.steps.QualityAssurancePage;

public class OpenPositionsTest extends BaseTest {

    @Test
    public void navigateToOPenPositions() {
        new QualityAssurancePage()
                .openQualityAssurancePage()
                .assertHeadingQA()
                .clickseeAllJobsButton();
        new OpenPositionsPage()
                .assertHeadingAllPositions();

        Assert.assertEquals(WebDriverRunner.getWebDriver().findElement(new ByXPath("//h3[text()='All open positions']")).isDisplayed(), true);

    }
    @Test
    public void openPositionsPage() throws InterruptedException {
        new QualityAssurancePage()
                .openQualityAssurancePage()
                .assertHeadingQA()
                .clickseeAllJobsButton();

        new OpenPositionsPage()

                .assertHeadingAllPositions();


        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://useinsider.com/careers/open-positions/?department=qualityassurance");
    }

    @Test
    public void selectFilter() throws InterruptedException {
        new QualityAssurancePage()
                .openQualityAssurancePage()
                .assertHeadingQA()
                .clickseeAllJobsButton();

        new OpenPositionsPage()

                .assertHeadingAllPositions()
                .clickLocationFilter();


        Assert.assertEquals(WebDriverRunner.getWebDriver().findElement(new ByXPath("//div[@id='jobs-list']")).isDisplayed(), true);

        String titleDepartment = WebDriverRunner.getWebDriver().findElement((new By.ByXPath("//div[@id='jobs-list']//span[text()='Quality Assurance']"))).getText();
        Assert.assertEquals(titleDepartment, "Quality Assurance");

        String titleLocation = WebDriverRunner.getWebDriver().findElement((new By.ByXPath("//div[@id='jobs-list']//div[text()='Istanbul, Turkey']"))).getText();
        Assert.assertEquals(titleLocation, "Istanbul, Turkey");

    }

    @Test
    public void redirectToJobPage() throws InterruptedException {
        new QualityAssurancePage()
                .openQualityAssurancePage()
                .assertHeadingQA()
                .clickseeAllJobsButton();

        new OpenPositionsPage()

                .assertHeadingAllPositions()
                .clickLocationFilter()
                .clickViewRoleButton();

        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), "https://jobs.lever.co/useinsider/78ddbec0-16bf-4eab-b5a6-04facb993ddc");
        Assert.assertEquals(WebDriverRunner.getWebDriver().findElement(new ByXPath(" (//a[text()='Apply for this job'])[1]")).isDisplayed(), true);

    }


}




