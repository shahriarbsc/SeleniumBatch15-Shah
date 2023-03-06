package Class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1Class4 {

    public static void main(String[] args) {

/*
Hw1 Class4:
        goto http://practice.syntaxtechs.net/basic-checkbox-demo.php
        check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not*/

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBtn = driver.findElement(By.cssSelector("input#isAgeSelected"));
        boolean isSelectableBtn = checkBtn.isSelected();
        System.out.println(" Is checkbox selected ? " + isSelectableBtn);
        if (!isSelectableBtn) ;
        checkBtn.click();
        isSelectableBtn = checkBtn.isSelected();
        System.out.println("Is checkbox selected now ? " + isSelectableBtn);
    }
}


