package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class fileUpload {

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
        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='file-upload']"));

        chooseFile.sendKeys("C:\\Users\\smash\\OneDrive\\Desktop\\Selenium class09.txt");


    }
}


