package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        // go to syntax.com

        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

// click on alert button

        driver.findElement(By.xpath("//button[@id='alert']")).click();


//wait until the alert is open

        WebDriverWait wait = new WebDriverWait(driver, 20);

        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();




    }


}
