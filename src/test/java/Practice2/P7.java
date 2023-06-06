package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class P7 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement startBtn =  driver.findElement(By.xpath("//button[@id='save']"));
        startBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First')]")));

        WebElement fName = driver.findElement(By.xpath("//p[starts-with(text(),'First')]"));
        System.out.println(fName.getText());
        WebElement lName = driver.findElement(By.xpath("//p[starts-with(text(),'Last')]"));
        System.out.println(lName.getText());
    }
}
