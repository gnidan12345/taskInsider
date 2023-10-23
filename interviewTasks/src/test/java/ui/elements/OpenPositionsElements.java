package ui.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OpenPositionsElements {

    public SelenideElement headingAllOpenPositions() {
        return $x("//h3[text()='All open positions']");
    }

    public SelenideElement clickFilter() {
        return $x("//span[@id='select2-filter-by-location-container']");

    }

    public SelenideElement jobBlocksDepartment() {
        return $x("//div[@id='jobs-list']//span[text()='Quality Assurance']");

    }

    public SelenideElement jobBlocksLocation() {
        return $x("//div[@id='jobs-list']//div[text()='Istanbul, Turkey']");

    }


    public SelenideElement DepartmentFilter() {
        return $x("//span[@id='select2-filter-by-department-container']");

    }


    public SelenideElement selectLocation() {
        return $x("//li[text()='Istanbul, Turkey']");
    }


    public SelenideElement jobList() {
        return $x("//div[@id='jobs-list']");
    }

    public SelenideElement viewRoleButton() {
        return $x("  (//a[text()='View Role'])[1]");
    }

    public SelenideElement jobBlockElement() {
        return $x("(//div[@class='position-list-item-wrapper bg-light'])[2]");
    }


    public SelenideElement acceptCookiesButton() {
        return $x("//a[@id='wt-cli-accept-all-btn']");
    }


    public SelenideElement jobsApplyButton() {
        return $x(" (//a[text()='Apply for this job'])[1]");
    }


}
