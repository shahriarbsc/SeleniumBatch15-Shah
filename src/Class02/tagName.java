package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver
        WebDriver driver = new ChromeDriver();
        // maximize the screen

        driver.manage().window().maximize();


        // open up the website

        driver.get("https://www.amazon.com/");

      // print all the links in the amazon.com

      driver.findElements(By.tagName("a"));





    }
}
