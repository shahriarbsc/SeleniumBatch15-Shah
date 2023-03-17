package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tablesDynamic {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        // go to page

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx");


        //  enter the username in the text box
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        //task: check the checkbox containing the product screensaver

        List<WebElement> column =driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
         // iterate through each to see if it is contains screen saver

        for (int i = 0; i < column.size() ; i++) {
            // extract the text

            String text= column.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")){

                System.out.println(text);

                System.out.println("the screensaver is located at row "+i+2);
                System.out.println("Check the check box");

                WebElement checkbox = driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr[" + (i + 2) + "]/td[1]"));
                checkbox.click();

            }

        }





    }

}
