package SeleniumMainFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class LoginDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys("Admin");

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys("Admin");

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();

        driver.findElement(By.linkText("Add Customer")).click();

        driver.findElement(By.name("name")).sendKeys("Raviteja");
        Thread.sleep(7000);

        driver.findElement(By.name("contact1")).sendKeys("8888888");
        Thread.sleep(7000);

        driver.findElement(By.name("address")).sendKeys("Hyderabad");
        Thread.sleep(7000);

        driver.findElement(By.name("contact2")).sendKeys("999999");
        Thread.sleep(7000);

        driver.findElement(By.name("Reset")).click();

        driver.quit();

    }
}

