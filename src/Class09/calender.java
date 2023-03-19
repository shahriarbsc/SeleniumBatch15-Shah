package Class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calender {

    public static void main(String[] args) {


//tell your project where the web driver is located
        // for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

// crate an instance of web driver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();



        //  go to the website
        driver.get("https://www.delta.com/");

//       click on the calander
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();

//         get the month from the calander
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));
//        get the next button
        WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));

//        click on next button until you find the right month
        boolean isFound=false;



        while(!isFound){

            String month_ = month.getText();
            if(month_.equalsIgnoreCase("January")){
//                select the day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String day_text = day.getText();
                    if(day_text.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }
            else {
                next.click();
            }

        }
    }
}



