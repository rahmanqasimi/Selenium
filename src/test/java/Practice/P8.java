package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P8 {
    public static void main(String[] args) throws InterruptedException {
        //      create instance
        WebDriver driver = new ChromeDriver();
//      maximize the page
        driver.manage().window().maximize();
//      navigate to the link
        driver.get("https://www.facebook.com");

        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();

        Thread.sleep(2000);

        WebElement fName = driver.findElement(By.cssSelector("input[name='firstname']"));
        fName.sendKeys("John");

        WebElement lName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lName.sendKeys("Doe");

        WebElement close = driver.findElement(By.cssSelector("img[src$='zGm8t.png']"));
        close.click();


    }
}
