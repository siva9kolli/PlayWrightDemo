package PlayWrightTests;

import Automation.BasePlaywright;

import Pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SauceLogin extends BasePlaywright {
    public LoginPage loginPage;

    @BeforeTest
    public void intilize(){
        loginPage = new LoginPage(page);
    }

    @Test
    public void login(){
        loginPage.login("standard_user", "secret_sauce");
    }
}
