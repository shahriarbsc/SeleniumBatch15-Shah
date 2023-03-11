package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW2Class6Sel {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement frame=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        WebElement element=driver.findElement(By.xpath("//p"));
        element.clear();
        element.sendKeys("Hello World!");
        driver.switchTo().defaultContent();

    }
}
