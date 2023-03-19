package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class jsexecutor {

    public static void main(String[] args) {


//tell your project where the web driver is located
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

// crate an instance of web driver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();


        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        //fill out username


        WebElement username =driver.findElement(By.xpath("//input[@name='txtUsername']"));
        username.sendKeys("admin");

        // using js executors as declaring the instance of java script executor

        // to highlight the username

        JavascriptExecutor js =(JavascriptExecutor) driver;

        //2.execute script

       // js.executeScript("arguments[0].style.border='10px dotted pink'",username);

       js.executeScript("arguments[0].style.border='3px solid blue'",username);


      // find the webElement

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

       // click the login button

       js.executeScript("arguments[0].click();",loginBtn);





    }
}

