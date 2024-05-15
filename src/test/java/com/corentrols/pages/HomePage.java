package com.corentrols.pages;

import com.corentrols.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//li[.='#Inbox']")
    public WebElement inbox;
    @FindBy(xpath = "//span[normalize-space()='Discuss']")
    public WebElement discussBtn;

    @FindBy(xpath = "//a[@data-menu='120']")
    public WebElement calendarBtn;

    @FindBy(xpath = "//a[@data-menu='194']")
    public WebElement notesBtn;

    @FindBy(xpath = "//a[@data-menu='68']")
    public WebElement contactsBtn;

    @FindBy(xpath = "//a[@data-menu='261']")
    public WebElement crmBtn;

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesBtn;

    @FindBy(xpath = "//a[@data-menu='382']")
    public WebElement webSiteBtn;

    @FindBy(xpath = "//a[@data-menu='484']")
    public WebElement pointOfSaleBtn;

    @FindBy(xpath = "//a[@data-menu='504']")
    public WebElement purchaseBtn;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement inventoryBtn;

    @FindBy(xpath = "//a[normalize-space(.)='More']")
    public WebElement moreBtn;

    @FindBy(xpath = "//a[@data-menu='415']")
    public WebElement manufacturingBtn;

    @FindBy(xpath = "//a[@data-menu='535']")
    public WebElement repairsBtn;

    @FindBy(xpath = "//a[@data-menu='333']")
    public WebElement projectBtn;

    @FindBy(xpath = "//a[@data-menu='124']")
    public WebElement eventsBtn;

    @FindBy(xpath = "//a[@data-menu='475']")
    public WebElement surveysBtn;

    @FindBy(xpath = "//a[@data-menu='157']")
    public WebElement employeesBtn;

    @FindBy(xpath = "//a[@data-menu='281']")
    public WebElement attendancesBtn;

    @FindBy(xpath = "//a[@data-menu='295']")
    public WebElement leavesBtn;

    @FindBy(xpath = "//a[@data-menu='388']")
    public WebElement expensesBtn;

    @FindBy(xpath = "//a[@data-menu='165']")
    public WebElement maintenancesBtn;

    @FindBy(xpath = "//a[@data-menu='134']")
    public WebElement fleetBtn;

    @FindBy(xpath = "//a[@data-menu='1']")
    public WebElement dashboardBtn;

    @FindBy(className = "oe_topbar_name")
    public WebElement userNameBtn;

    @FindBy(xpath = "documentation")
    public WebElement documentationBtn;

    @FindBy(xpath = "//a[@data-menu='support']")
    public WebElement supportBtn;

    @FindBy(xpath = "//a[@data-menu='settings']")
    public WebElement preferencesBtn;

    @FindBy(xpath = "//a[@data-menu='account']")
    public WebElement accountBtn;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logoutBtn;

    @FindBy(xpath = "//a[normalize-space()='More']")
    public WebElement moreButton;

    @FindBy(xpath = "//span[normalize-space()='Fleet']")
    public WebElement fleetBttn;





}
