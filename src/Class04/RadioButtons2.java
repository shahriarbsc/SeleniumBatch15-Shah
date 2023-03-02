package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {
    public static void main(String[] args) {


        //tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        // go to syntax project.com

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

// find all the age group radio button

        // the xpath here is common to all the webElements that have the age group

               List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));

// iterate over the list to see your desired one

        for (WebElement radioBtn: radioBtns) {

            String age =radioBtn.getAttribute("value");


// if the value of the webElement is 5-10 click on it.

          if(age.equalsIgnoreCase("0 - 5")){
              radioBtn.click();
          }


        }

    }
}
