package BasicAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo2 {

    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
       // WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        //System.out.println(driver.getTitle());
       // System.out.println(driver.getCurrentUrl());

        //Thread.sleep(3000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("http://gmail.com");

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("http://Whatsapp.com");
        //Thread.sleep(5000);

        driver.navigate().forward();
        //Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("http://facebook.com");
       // Thread.sleep(5000);

        driver.navigate().refresh();
        //Thread.sleep(5000);

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("http://youtube.com");
        //Thread.sleep(5000);

        driver.navigate().back();
        //Thread.sleep(5000);

        //driver.close();
        driver.quit();

    }
}
