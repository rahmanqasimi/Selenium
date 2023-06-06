package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class P6 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement startBtn =  driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome')]")));
        WebElement text = driver.findElement(By.xpath("//h4[contains(text(),'Welcome')]"));
        System.out.println(text.getText());

    }
}
