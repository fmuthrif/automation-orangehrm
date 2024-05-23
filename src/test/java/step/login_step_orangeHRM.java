package step;

import config.env;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import object.login_object_orangeHRM;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_step_orangeHRM extends env {
    login_object_orangeHRM elementLogin = new login_object_orangeHRM();

    @Given("User is in login page")
    public void user_is_in_login_page() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(elementLogin.getBtnLogin()));
        driver.findElement(elementLogin.getTxtUsername()).isDisplayed();
        driver.findElement(elementLogin.getTxtPassword()).isDisplayed();
        driver.findElement(elementLogin.getBtnLogin()).isDisplayed();
    }
    @When("User input username")
    public void user_input_username() {
        driver.findElement(elementLogin.getTxtUsername()).sendKeys("Admin");
    }
    @And("User input password")
    public void user_input_password() {
        driver.findElement(elementLogin.getTxtPassword()).sendKeys("admin123");
    }
    @And("User click login")
    public void user_click_login() {
        driver.findElement(elementLogin.getBtnLogin()).click();
    }
    @Then("user redirect to dashboard page")
    public void user_redirect_to_dashboard_page() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLogin.getTxtDashboard())).isDisplayed();
    }
}
