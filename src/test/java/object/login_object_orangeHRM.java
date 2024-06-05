package object;

import org.openqa.selenium.By;

public class login_object_orangeHRM {
    By txtUsername = By.xpath("//*[@placeholder='Username']");
    public By getTxtUsername(){ return txtUsername; }

    By txtPassword = By.xpath("//*[@type='password']");
    public By getTxtPassword(){ return txtPassword; }

    By btnLogin = By.xpath("//*[@type='submit']");
    public By getBtnLogin(){ return btnLogin; }

    By txtDashboard = By.xpath("//*[@class='oxd-main-menu-item active']");
    public By getTxtDashboard(){ return txtDashboard; }

    By imgAccount = By.xpath("//*[@class='oxd-userdropdown-tab']");
    public By getImgAccount(){ return imgAccount; }

    By txtLogout = By.xpath("//a[@href='https://opensource-demo.orangehrmlive.com/web/index.php/auth/logout']");
    public By getTxtLogout(){ return txtLogout; }
}
