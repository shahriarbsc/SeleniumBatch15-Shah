package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Selenium {

    public static void main(String[] args) {

        //    /**
        //     * 1. launch the browser
        //     * 2. navigate to amazon web site
        //     * 3. print out the title and the url in the console
        //     * 4. close the browser
        //     */
        //



        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");


        //create an instances of WebDriver

        WebDriver driver=new ChromeDriver();


        // open the website amazon.com


        driver.get("https://www.amazon.com/");

        // get the current url that is there in the browser.

        String URL=driver.getCurrentUrl();

        // print out the url

        System.out.println(URL);

// Get the title of the web page

        String title =driver.getTitle();

        //print the title of the page
        System.out.println("the title of the page is "+title);

        //close the browser
        driver.quit();
















    }
}
