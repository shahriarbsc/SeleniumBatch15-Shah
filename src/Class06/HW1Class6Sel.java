package Class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HW1Class6Sel {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//div[@id='finish']")).click();
        WebElement text=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("Hidden element is "+text.getText());

    }
}
