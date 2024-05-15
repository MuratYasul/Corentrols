package com.corentrols.step_defs;

import com.corentrols.pages.HomePage;
import com.corentrols.pages.LoginPage;
import com.corentrols.pages.MenuOptionsPage;
import com.corentrols.utilities.BrowserUtils;
import com.corentrols.utilities.ConfigurationReader;
import com.corentrols.utilities.Driver;
import io.cucumber.java.en.*;

import java.lang.module.Configuration;

import static org.junit.Assert.assertTrue;

public class menuOptionsStepDfns {

    HomePage homePage = new HomePage();
    MenuOptionsPage menuOptionsPage= new MenuOptionsPage();
    LoginPage loginPage= new LoginPage();

    @Given("User enters {string} and {string} for Pos Manager")
    public void user_enters_and_for_pos_manager(String userName, String password) {
       Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.emailInputBox.sendKeys(userName);
       loginPage.passwordInputBox.sendKeys(password);
     //  loginPage.loginButton.click();
    }
    @When("User clicks more button on the homepage")
    public void user_clicks_more_button_on_the_homepage() {
        BrowserUtils.waitForElementClickable(homePage.moreButton);
        homePage.moreButton.click();
    }
    @When("User clicks the fleet button from dropdown")
    public void user_clicks_the_fleet_button_from_dropdown() {
       BrowserUtils.waitForElementClickable(homePage.fleetBtn);
        homePage.fleetBtn.click();
    }
    @Then("user can see {string} menu")
    public void user_can_see_menu(String menu) {
        switch (menu) {
            case "Vehicles" -> assertTrue(menuOptionsPage.vehiclesBtn.isDisplayed());
            case "Vehicles Odometer" -> assertTrue(menuOptionsPage.vehiclesOdometerBtn.isDisplayed());
            case "Vehicle Costs" -> assertTrue(menuOptionsPage.vehiclesCostsBtn.isDisplayed());
            case "Vehicles Contracts" -> assertTrue(menuOptionsPage.vehiclesContractsBtn.isDisplayed());
            case "Vehicles Fuel Logs" -> assertTrue(menuOptionsPage.vehiclesFuelLogsBtn.isDisplayed());
            case "Vehicles Services Logs" -> assertTrue(menuOptionsPage.vehiclesServicesLogsBtn.isDisplayed());
            case "Costs" -> assertTrue(menuOptionsPage.costsBtn.isDisplayed());
            case "Indicative Costs" -> assertTrue(menuOptionsPage.indicativeCostsBtn.isDisplayed());
            case "Vehicle Model" -> assertTrue(menuOptionsPage.vehicleModelBtn.isDisplayed());
            case "Model make of Vehicle" -> assertTrue(menuOptionsPage.modelMakeOfVehicleBtn.isDisplayed());
            case "Service Types" -> assertTrue(menuOptionsPage.serviceTypesBtn.isDisplayed());
            case "Contract Types" -> assertTrue(menuOptionsPage.contractTypesBtn.isDisplayed());
            case "Vehicle Status" -> assertTrue(menuOptionsPage.vehicleStatusBtn.isDisplayed());
            case "Vehicle Tags" -> assertTrue(menuOptionsPage.vehiclesTagsBtn.isDisplayed());
        }

        }
    }



