package com.corentrols.pages;

import com.corentrols.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuOptionsPage {
    public MenuOptionsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[normalize-space(.)='Vehicles']")
    public WebElement vehiclesBtn;

    @FindBy(xpath = "//span[contains(text(),'Vehicles Odometer')]")
    public WebElement vehiclesOdometerBtn;

    @FindBy (xpath = "//span[contains(text(),'Vehicle Costs')]")
    public WebElement vehiclesCostsBtn;

    @FindBy (xpath = "//span[contains(text(),'Vehicles Contracts')]")
    public WebElement vehiclesContractsBtn;

    @FindBy (xpath = "//span[contains(text(),'Vehicles Fuel Logs')]")
    public WebElement vehiclesFuelLogsBtn;

    @FindBy (xpath = "//span[contains(text(),'Vehicles Services Logs')]")
    public WebElement vehiclesServicesLogsBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Costs']")
    public WebElement costsBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Indicative Costs']")
    public WebElement indicativeCostsBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Vehicle Model']")
    public WebElement vehicleModelBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Model make of Vehicle']")
    public WebElement modelMakeOfVehicleBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Service Types']")
    public WebElement serviceTypesBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Contract Types']")
    public WebElement contractTypesBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Vehicle Status']")
    public WebElement vehicleStatusBtn;

    @FindBy(xpath = "//span[normalize-space(text())='Vehicle Tags']")
    public WebElement vehiclesTagsBtn;

}
