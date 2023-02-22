package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize {
    public static void main(String[] args) {


        // connect to the webdriver

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // open google .com

        driver.get("https://google.com");
// maximize the window

        driver.manage().window().maximize();
        // full screen

        driver.manage().window().fullscreen();
        //close

        driver.close();


    }
}
