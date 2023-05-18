package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6 {
    public static void main(String[] args) {
        // xpath //tagname[@attribute="value"]
        // xpath //tagname[text()="value"]
        WebDriver driver = new ChromeDriver();
//        maximize
        driver.manage().window().maximize();
//        navigate to facebook.com
        driver.get("https://www.facebook.com");
//        get the create new account link using xpath attribute
        WebElement xpathAtt= driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']"));
        System.out.println(xpathAtt.getText());

        WebElement xpathPartAtt= driver.findElement(By.xpath("//a[contains(@ajaxify,'/reg')]"));
        System.out.println(xpathPartAtt);


        WebElement xpathText= driver.findElement(By.xpath("//a[text()='Create new account']"));
        System.out.println(xpathText.getText());

    }
}
