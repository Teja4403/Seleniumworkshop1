package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataDriven {

    @Test(dataProvider = "getData")
    public void MYLoginTest1(String username, String password) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");

        WebElement txtUsername = driver.findElement(By.id("login-username"));
        txtUsername.sendKeys(username);

        WebElement txtPassword = driver.findElement(By.id("login-password"));
        txtPassword.sendKeys(password);

        WebElement btnLogin = driver.findElement(By.name("submit"));
        btnLogin.click();
    }

    @DataProvider
    Object[][] getData()
    {
        Object[][] data = new Object[4][2];

        data[0][0] = "Admin";
        data[0][1] = "Admin";

        data[1][0] = "Invalid1";
        data[1][1] = "Invalid1";

        data[2][0] = "Invalid2";
        data[2][1] = "Invalid2";

        data[3][0] = "Invalid3";
        data[3][1] = "Invalid3";

        return data;
    }
}