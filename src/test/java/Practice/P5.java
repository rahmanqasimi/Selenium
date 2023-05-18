package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class P5 {
    public static void main(String[] args) {
//        navigate to amazon.com using chrome and maximize
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com/");

//        get all the links
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//        driver.findElements(By.tagName("a"));

//        System.out.println(allLinks.size());
        for (WebElement links: allLinks){
            String link = links.getAttribute("href");
            System.out.println(link);
        }
    }
}
