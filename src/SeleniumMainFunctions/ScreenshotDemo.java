package SeleniumMainFunctions;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotDemo
{
    @Test
    public void MYLoginTest1() throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.org/");
        //driver.get("https://facebook.com");
        //driver.get("https://gmail.com");

        //Create the object reference take screenshot. Assign the current driver to it
        TakesScreenshot ts = (TakesScreenshot) driver;

        //Using ts >> Call method
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        String timestamp = new SimpleDateFormat("yyyymmdd_hhmmss").format(new Date());
        String filename = "IMG"+timestamp+".png";

        //Copy this file object into a real image file
        FileUtils.copyFile(srcFile,new File("D:\\Selenium\\5 days_Notes_Selenium\\Screenshots\\"+filename));

        driver.quit();


    }
}
