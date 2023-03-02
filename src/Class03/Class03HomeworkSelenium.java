package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class03HomeworkSelenium {
    public static void main(String[] args) throws InterruptedException {

        /*enter the message in the text box
        click on show message
        Enter value of a
        Enter value of B
        click on the button get total
        also please print the value of the attribute type of the button GET TOTAL*/


        //tell your project where the webdriver is located.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Please enter numbers");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter value']")).sendKeys("20");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("10");
        driver.findElement(By.xpath("//button[@onclick='return total()']")).click();
        String getTotal = driver.findElement(By.xpath("//span[@id='displayvalue']")).getText();
        System.out.println("Total value of  a+b= "+getTotal);
        Thread.sleep(2000);
        driver.close();
        driver.quit();






    }
}
