package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webOrderTask2 {
    public static void main(String[] args) {

        /**
         * Task
         * Navigate to http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx
         * Login
         * Get title and verify it is correct
         * logout
         * close the browser
         */



        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver
        WebDriver driver = new ChromeDriver();

        // open up the website

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


        // send the username
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        // send the password

        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

// click on the login button

        driver.findElement(By.className("button")).click();

        // verify the title is correct

        String title = driver.getTitle();


        if(title.equalsIgnoreCase("Web Orders")){

            System.out.println("the title is correct");
        }else{

            System.out.println("the title is incorrect");
        }

        // logout

        driver.findElement(By.linkText("Logout")).click();

        //close the browser

        driver.quit();


    }
}
