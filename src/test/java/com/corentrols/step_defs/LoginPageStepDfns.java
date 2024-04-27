package com.corentrols.step_defs;

import com.corentrols.pages.HomePage;
import com.corentrols.pages.LoginPage;
import com.corentrols.utilities.BrowserUtils;
import com.corentrols.utilities.ConfigurationReader;
import com.corentrols.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginPageStepDfns {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enter username {string} in username box")
    public void user_enter_username_in_username_box(String username) {
        loginPage.emailInputBox.sendKeys(username);
    }
    @When("user enter password {string} in password box")
    public void user_enter_password_in_password_box(String password) {
       loginPage.passwordInputBox.sendKeys(password);
    }
    @When("user click login button")
    public void user_click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("user should login homepage")
    public void user_should_login_homepage() {
       BrowserUtils.titleAssertion(Driver.getDriver().getTitle());
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Odoo";
        Assert.assertEquals(expectedTitle, actualTitle);
        System.out.println("actualTitle : " +actualTitle);
        System.out.println("expectedTitle : " +expectedTitle);

    }


}
