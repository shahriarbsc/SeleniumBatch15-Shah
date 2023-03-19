package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClass {

    public static void main(String[] args) {


//tell your project where the web driver is located
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

// crate an instance of web driver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

// go to syntax HRMS application and log in and into


        //  go to the website
        driver.get("https://www.amazon.com/");


       WebElement en= driver.findElement(By.xpath("//div[text()='EN']"));

        //action class

        Actions actions = new Actions(driver);

        actions.moveToElement(en).perform();




    }
}


