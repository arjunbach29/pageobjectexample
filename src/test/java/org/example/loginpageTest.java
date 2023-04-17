package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginTest
{
    WebDriver driver;
    @Test
    public void loginverification(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        loginpage login =new loginpage(driver);
        login.enterthename();
        login.enterpassword();
        login.loginbutton();
      //  driver.quit();


    }
}
