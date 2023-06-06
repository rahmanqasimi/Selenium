package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.time.Duration.ofSeconds;

public class P5 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Button']")));
        WebElement eBtn = driver.findElement(By.xpath("//button[text()='Button']"));
//        wait.until(ExpectedConditions.elementToBeClickable(eBtn));
        eBtn.click();

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[text()='Enabled']")));

        WebElement vBtn = driver.findElement(By.xpath("//button[text()='Enabled']"));
        vBtn.click();

        driver.findElement(By.xpath("//button[@id='alert']")).click();
        wait.until(ExpectedConditions.alertIsPresent());

        Alert isAlert = driver.switchTo().alert();
        isAlert.accept();



    }
}
