package ui.tests;

import org.testng.annotations.Test;
import ui.steps.MainPage;

public class CompanyTest extends BaseTest {

    @Test
    public  void  navigateToMainPage(){
        new MainPage()
                .openHomePage()
                .assertNavigationIsVisible()
                .assertUlr();


    }

    @Test
    public void navigateToCarieerPage(){
        new MainPage()
                .openHomePage()
                .clickCompanyButton();
    }
}
