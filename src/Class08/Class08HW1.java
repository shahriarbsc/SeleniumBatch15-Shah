package Class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Class08HW1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        1.Navigate to given URL
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        Enter the credentials and Login
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
//        Navigate to PIM Option
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();
//        From the table select Any  value of id and click the check box associated with it
        List<WebElement> idColumn = driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr/td[2]"));

        for (int i = 0; i < idColumn.size(); i++) {
            WebElement columns = idColumn.get(i);
            String name = columns.getText();
            if (name.equalsIgnoreCase("52393A")
            ) {
                System.out.println(name + " ID is located in row number " + i);
                System.out.println(name + " Check box is located in row number " + (i + 1));
                WebElement checkBox = driver.findElement(By.xpath("//table[@class='table hover']/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();

            }
        }
        Thread.sleep(4000);
        driver.close();


    }
}
