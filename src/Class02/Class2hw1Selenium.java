package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2hw1Selenium {
    public static void main(String[] args) throws InterruptedException {
     /* HW1:
        navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser
        */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver
        WebDriver driver = new ChromeDriver();
        // maximize the screen

        driver.manage().window().maximize();

        // navigate to
        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");


        // sleep for 2 seconds
        Thread.sleep(2000);


        // send the username
        driver.findElement(By.id("customer.firstName")).sendKeys("Mister");

        // send the password


        driver.findElement(By.name("customer.address.street")).sendKeys("1905 filmore ave");
        driver.findElement(By.name("customer.address.city")).sendKeys("Buffalo");
        driver.findElement(By.name("customer.address.state")).sendKeys("New york");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("14112");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("3476258345");
        driver.findElement(By.name("customer.ssn")).sendKeys("12345678");
        driver.findElement(By.id("customer.username")).sendKeys("shahriar.bsc@gmail.com");
        driver.findElement(By.id("customer.password")).sendKeys("Tester");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Tester");


        //click on register
        driver.findElement(By.className("button")).click();


        // sleep for 2 seconds
        Thread.sleep(2000);


        // close the browser

        driver.close();


    }
}
