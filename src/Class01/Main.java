package Class01;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // for windows add extension .exe
        //  you can use \
        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.google.com/"); // navigate to the specified url
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver(); //launch the browser
        driver2.get("https://www.google.com/"); // navigate to the specified url
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        // for windows add extension .exe
        //  you can use \
        WebDriver driver3 = new EdgeDriver(); //launch the browser
        driver3.get("https://www.google.com/"); // navigate to the specified url
    }
}