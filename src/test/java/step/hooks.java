package step;

import config.env;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hooks extends env {
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "D:\\selenium-basic\\automation-orangehrm\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
                driver.manage().window().maximize();
    }
    @After
    public void after(){
    }
}
