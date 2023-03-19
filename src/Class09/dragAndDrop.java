package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

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
        driver.get("https://jqueryui.com/droppable/");

        //

        driver.switchTo().frame(0);





// get the element which you want to drag.

        WebElement draggable = driver.findElement(By.id("draggable"));

// get the droppable element

        WebElement droppable =driver.findElement(By.id("droppable"));


//action class

      Actions action = new Actions(driver);

        action.dragAndDrop(draggable, droppable).perform();




    }
}


