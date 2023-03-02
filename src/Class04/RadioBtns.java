package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {


        //tell your project where the webdriver is located.
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        // go to syntax project.com

        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");


// click on the radio button Male

        WebElement maleBtn = driver.findElement((By.cssSelector("input[value='Male']")));

        // check if the radio button is enabled

        boolean isEnableMale = maleBtn.isEnabled();

        System.out.println("the radio button male is enabled " + isEnableMale);


        //check if the radio button is displayed

        boolean isDisplayedMale =maleBtn.isDisplayed();
        System.out.println(isDisplayedMale);

        // check if the radio button is selected

        boolean isSelectedmale = maleBtn.isSelected();

        System.out.println("the male button is selected "+isSelectedmale);

        // if the radio button is selected click on it

        if(!isSelectedmale){

            maleBtn.click();
        }

        // check if the radio button is selected after the class

        isSelectedmale= maleBtn.isSelected();
        System.out.println("the status of selection is "+isSelectedmale);


        maleBtn.click();


    }
}
