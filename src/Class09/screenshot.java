package Class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshot {
    public static void main(String[] args) throws IOException {

//tell your project where the web driver is located
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

// crate an instance of web driver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();


        //  go to the website
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");


//        username Text Box
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //        password field

// take screenshot

        TakesScreenshot ss = (TakesScreenshot) driver;

        // take the screenshot as file

        File sourceFile =ss.getScreenshotAs(OutputType.FILE); // Call the method byte format & return type is File

        // save the file in computer

        FileUtils.copyFile(sourceFile,new File("C:/Users/smash/IdeaProjects/SeleniumBatch15/src/screen/iou.png"));




    }
}
