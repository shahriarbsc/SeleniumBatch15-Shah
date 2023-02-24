package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2hw2Selenium {
    public static void main(String[] args) throws InterruptedException {

               /* HW2
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser
        TIP for HW2:
        just fill in text boxes or button, no need to deal with other webElements
*/
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver
        WebDriver driver = new ChromeDriver();
        // maximize the screen

        driver.manage().window().maximize();

        // open up the website
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Shahriar");
        driver.findElement(By.name("lastname")).sendKeys("Shah");
        driver.findElement(By.name("reg_email__")).sendKeys("shahriar.bsc2014@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("shahriar.bsc2014@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Tester");
        driver.findElement(By.name("birthday_day")).sendKeys("13");
        driver.findElement(By.name("birthday_month")).sendKeys("03");
        driver.findElement(By.name("birthday_year")).sendKeys("1991");
        driver.findElement(By.name("sex")).click();

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);

        driver.quit();




    }
}
