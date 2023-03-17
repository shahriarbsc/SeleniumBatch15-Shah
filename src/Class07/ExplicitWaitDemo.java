package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        // go to syntax.com

        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");

        //click on the start button

        driver.findElement(By.xpath("//button[@id='startButton']")).click();

//as the element that contains text becomes visible after sometime, so first we need to implement the
        //explicit wait and then get the text

        WebDriverWait wait = new WebDriverWait(driver, 20);

        // for selenium 4 version
        // WebDriverWait wait= new WebDriverWait (driver, 20);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));

        // once the element is visible then get the text.

        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        String WelcomeText = text.getText();

        System.out.println(WelcomeText);


    }


}
