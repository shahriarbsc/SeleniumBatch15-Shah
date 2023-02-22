package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

    public static void main(String[] args) throws InterruptedException {

        //connect to webdriver

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // initiate the instance of webdriver

        WebDriver driver = new ChromeDriver();
// open google .com

        driver.get("https://google.com");
// now navigate to facebook.com

        // slow down.
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);

        // go back

        driver.navigate().back();

        Thread.sleep(2000);

        // go to facebook

        driver.navigate().forward();

        Thread.sleep(2000);
        //slow down

        // refresh the page
        driver.navigate().refresh();

        // close the browser

        driver.close();


    }

}
