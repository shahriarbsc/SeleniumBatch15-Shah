package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableDemo {

    public static void main(String[] args) {


//tell your project where the web driver is located
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

// crate an instance of web driver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();

// go to syntax HRMS application and log in and into


        //  go to the website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        //fill out username
        driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
        //fill out password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Hum@nhrm123");
        //press the Login button
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        //find the PIM button
        WebElement pimBtn = driver.findElement(By.xpath("//b[text()='PIM']"));
        //click on it
        pimBtn.click();
        //find the Employee List
        WebElement employeeListBtn = driver.findElement(By.xpath("//a[text()='Employee List']"));
        //click on it
        employeeListBtn.click();

//        ------------------------

//        get the employee id 52396A  and click on the checkbox associated with it

        // List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        //in order to find the desired id


        boolean idFound = false;
        while (!idFound) {

            //as DOM is refreshed after the click on next page so we find the elements in the loop
            // while (idFound) {
            List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]")); // its inside the loop because stale elements exceptions


            for (int i = 0; i < ids.size(); i++) {  // scan the whole 50 values of a page
                String id = ids.get(i).getText();

                if (id.equalsIgnoreCase("52097A")) { // id is in page 2 now

                    System.out.println("id is on the row " + i);
//                to click on the particular checkbox
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    checkBox.click();
                    idFound = true;
                    break;  // break the for loop here is inner loop.
                }
            }
            // click on the next page

            if (!idFound) {
                WebElement nextBtn = driver.findElement(By.xpath("//a[text()='Next']"));

                nextBtn.click();


            }
        }
    }

}