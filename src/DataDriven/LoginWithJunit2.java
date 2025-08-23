package DataDriven;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithJunit2 {

    @Test
    public void MYLoginTest1(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("Admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

//        String expected = "https://stock.scriptinglogic.org/dashboard.php";
//        String actual = driver.getCurrentUrl();
//
//        String expected = "POSNIC - Dashboard";
//        String actual = driver.getTitle();

        String expected = "Dashboard";
        String actual = driver.findElement(By.xpath("//a[normalize-space()='Dashboard']")).getText();

        System.out.println("expected = "+ expected);
        System.out.println("actual = "+ actual);

        Assert.assertEquals("This is bot a Dashboard",expected,actual);


    }
    @Test
    public void MYLoginTest2(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("ravi");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("ravi");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }
    @Test
    public void MYLoginTest3(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

    }
}
