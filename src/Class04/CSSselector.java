package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {
    public static void main(String[] args) throws InterruptedException {

        //tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

// max the window
        driver.manage().window().maximize();


        // go to facebook.com

        driver.get("https://www.facebook.com");

// click on the button create account using css selector


        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid= 'open-registration-form-button']"));

        //click on the button

        createNewBtn.click();


        //put a sleep statement on that browser can open up the window which contains the element
        Thread.sleep(1000);

// fil in the first name

        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));

        firstName.sendKeys("abracadbara");








    }
}
