package object;

import org.openqa.selenium.By;

public class login_object_orangeHRM {
    By txtUsername = By.xpath("//*[@placeholder=\"Username\"]");
    public By getTxtUsername(){ return txtUsername; }

    By txtPassword = By.xpath("//*[@type=\"password\"]");
    public By getTxtPassword(){ return txtPassword; }

    By btnLogin = By.xpath("//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
    public By getBtnLogin(){ return btnLogin; }

    By txtDashboard = By.xpath("//*[contains(text(), 'Dashboard']");
    public By getTxtDashboard(){ return txtDashboard; }
}
