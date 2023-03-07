package tests;

import org.asynchttpclient.request.body.multipart.Part;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AlertsPage;
import pages.LandingPage;
import pages.LoginPage;
import pages.PartRiskManagerPage;

public class PCNTest extends TestBase{

    LandingPage landingPage;
    PartRiskManagerPage partRiskManagerPage;
    AlertsPage alertsPage;
    LoginPage loginPage;
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test01() throws InterruptedException {
        landingPage = new LandingPage(driver);
        partRiskManagerPage = new PartRiskManagerPage(driver);
        alertsPage = new AlertsPage(driver);
        loginPage = new LoginPage(driver);

        //first step
        loginPage.userLogin("ahmed.helal@z2dataeg.com", "Ah@12345");
        Thread.sleep(3000);
        String welcomeMsg = landingPage.getWelcomeMsgTxt();
        softAssert.assertTrue(welcomeMsg.contains("Welcome"));
        softAssert.assertAll();
        Thread.sleep(3000);
    }
}
