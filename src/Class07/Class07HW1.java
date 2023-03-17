package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Class07HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();



/*For homework
//You have to do all explicit wait examples from.the link I used in class .
//For the alert example*/



        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));

        WebElement display=driver.findElement(By.xpath("//button[@id='display-other-button']"));
        display.click();
        System.out.println(display.isDisplayed());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='display-other-button']"))).click();

        WebElement enable=driver.findElement(By.xpath("//button[@id='enable-button']"));
        enable.click();
        System.out.println(enable.isEnabled());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='enable-button']")));
        driver.findElement(By.xpath("//button[text()='Button']")).click();

        WebElement check=driver.findElement(By.xpath("//button[@id='checkbox']"));
        check.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='checkbox']")));



    }
}
