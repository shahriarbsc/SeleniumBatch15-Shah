package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {
    public static void main(String[] args) {


        //tell your project where the webdriver is located.

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();


        // open the website facebook in google.com

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");


        // find the username

        WebElement username = driver.findElement(By.xpath("//input[contains(@name,'username')]"));

        username.sendKeys("Tester");

        // find the password field

        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");

        // clear the username text box using method clear
        username.clear();

        //to get the text username which is beside the username text box

        WebElement usernameText = driver.findElement(By.xpath("//label[text()='Username:']"));
        System.out.println(usernameText.getText());

        // get the text password which is beside the password test box

        WebElement passwordText =driver.findElement(By.xpath("//label[text()='Password:'] "));

        String passText = passwordText.getText();
        System.out.println(passText);


    }
}
