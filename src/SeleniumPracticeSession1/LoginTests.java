package SeleniumPracticeSession1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTests {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("Admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername2 = driver2.findElement(By.id("login-username"));
        txtUsername2.sendKeys("ravi");

        WebElement txtPassword2 = driver2.findElement(By.id("login-password"));
        txtPassword2.sendKeys("ravi");

        WebElement btnLogin2 = driver2.findElement(By.name("submit"));
        btnLogin2.click();

        WebDriver driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername3 = driver3.findElement(By.id("login-username"));
        txtUsername3.sendKeys("");

        WebElement txtPassword3 = driver3.findElement(By.id("login-password"));
        txtPassword3.sendKeys("");

        WebElement btnLogin3 = driver3.findElement(By.name("submit"));
        btnLogin3.click();
        
        WebDriver driver4 = new ChromeDriver();
        driver4.manage().window().maximize();
        driver4.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername4 = driver4.findElement(By.id("login-username"));
        txtUsername4.sendKeys("");

        WebElement txtPassword4 = driver4.findElement(By.id("login-password"));
        txtPassword4.sendKeys("");

        WebElement btnLogin4 = driver4.findElement(By.name("submit"));
        btnLogin4.click();
        driver.close();

    }
}
}

