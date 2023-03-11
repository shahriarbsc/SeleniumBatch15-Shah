package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitwait {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

// max the window
        driver.manage().window().maximize();

        // implicit wait

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // go to facebook.com

        driver.get("http://www.facebook.com");

      //click on the create new account

        driver.findElement(By.linkText("Create new account")).click();


        //Send your firstname

        driver.findElement(By.name("firstname")).sendKeys("abracadabra");






    }

}
