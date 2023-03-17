package Class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TableSimple {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //create an instances of WebDriver

        WebDriver driver = new ChromeDriver();

        // max the window
        driver.manage().window().maximize();


        // go to page

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");


        //task 1= access lavel -1 table based access
        // get the whole table accessed and print the whole tables


        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        String table_data = table.getText();
        // System.out.println(table_data);

        //Task-2: row level access
        //Get the rows of the table and print them


        // modification: print the row that contains company google.

        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        // print the rows

        for (WebElement row : Rows) {

            //extract text from each row
            String row_text = row.getText();
            if (row_text.contains("Google")) {

                System.out.println(row_text);
            }

        }

//Task-3 : column level access

        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

        for (WebElement column : columns) {

            System.out.println(column.getText());
        }


        // modify: Task4: just print the first column of every row

        List<WebElement> first_columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));

        for (WebElement first_col : first_columns) {
            System.out.println(first_col.getText());

        }

    }
}