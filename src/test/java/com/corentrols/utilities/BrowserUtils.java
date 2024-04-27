package com.corentrols.utilities;

import com.corentrols.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class BrowserUtils {
  public static void waitForTitle (String title) {
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.titleIs(title));
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }

  public static void waitForTitleContains (String title) {

    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.titleContains(title));
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }

  public static void titleAssertion (String expectedTitle) {
    Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
  }

  /**
   * This method accepts a WebElement as an argument and the driver waits for the element till the given element is visible in 15 seconds
   *
   * @param element
   * @throws TimeoutException When the driver cannot find the element inDriver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   *     WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
   *     wait.until(ExpectedConditions.titleIs(title));
   *     Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 15 seconds
   */
  public static void waitForElement (WebElement element) {

  /**  Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
    wait.until(ExpectedConditions.visibilityOf(element));
    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
*/
     }

  public static void waitUntilDisappear (WebElement element) {
  /**  Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    wait.until(ExpectedConditions.invisibilityOf(ele Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
   WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
   wait.until(ExpectedConditions.visibilityOf(element));
   Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   ment));
    Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   */
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.invisibilityOf(element));
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }

  public static void sleep (int second) {
    try {
      Thread.sleep(second * 1000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  /**
   * This method accepts a WebElement as an argument and the driver waits for the element to be clickable in 15 seconds.
   *
   * @param element
   * @throws TimeoutException When the driver cannot find the element in 15 seconds
   */
  public static void waitForElementClickable (WebElement element) {

    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }

  public static void verifyTextEquals (WebElement element, String expectedText) {
    Assert.assertEquals(element.getText(), expectedText);
  }

  public static void verifyTextContains (WebElement element, String expectedText) {
    Assert.assertTrue(element.getText().contains(expectedText));
  }

  public static void verifyTextContains (String containerText, String expectedText) {
    Assert.assertTrue(containerText.contains(expectedText));
  }

  /**
   * This method will delete what is created recently. It can be applied to any created vehicle, odometer, cost etc. Locators are based on the text of the buttons.
   */
//  public static void deleteCreatedOne () {
//    VehiclesPage vehiclesPage = new VehiclesPage();
//    vehiclesPage.actionsButton.click();
//    vehiclesPage.deleteButton.click();
//    vehiclesPage.okButtonForDelete.click();
//  }

  /**
   * This method will upload a file to the browser. It can be applied to any file upload button.
   * System.getProperty("user.dir") returns the path of the project. Ex: D:\Repos\Java-SDET\Fidex10-Group24
   *
   * @param InputElement The WebElement of the file upload button. Ex: //div[@class='o_form_image_controls']//form[@method='post']//input[@type='file']"
   * @param filePath     The path of the file to be uploaded. Ex: "images/mando.jpg"
   */
  public static void uploadFile (WebElement InputElement, String filePath) {
    InputElement.sendKeys(System.getProperty("user.dir").replace("\\", "/") + "/src/test/resources/" + filePath);
  }
  public static void isTheNumberFloat(WebElement element){
    String number= element.getText();
    System.out.println("activation_cost = " + number);
    Scanner scanner = new Scanner(number);


    scanner.useLocale(Locale.US);

    while (scanner.hasNext()) {

      if (scanner.hasNextFloat()) {
        System.out.println("Found Float: " + scanner.nextFloat());
      }

      System.out.println("Not Found Float: " + scanner.next());
    }
    scanner.close();
  }

  /**
   * This method waits for the visibility of the element
   *     - for 5 seconds
   *     - polling every 500ms
   *     - ignoring NoSuchElementException
   * @param element - WebElement
   */
  public static void fluentWait(WebElement element){


    Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
            .withTimeout(Duration.ofSeconds(5L)) // Maximum wait time
            .pollingEvery(Duration.ofSeconds(5L)) // Check condition every 5 seconds
            .ignoring(NoSuchElementException.class); // Ignore NoSuchElementException
  }

}