package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class P19 extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        JavascriptExecutor js= (JavascriptExecutor) driver;

        WebElement btn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        btn.click();

        js.executeScript("arguments[0].click();", btn);
    }
}
