package Practice2;


import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class P22 extends CommonMethods {
    public static void main(String[] args) throws IOException {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        loginBtn.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);

        takeScreenshot("C:\\Users\\mutee\\IdeaProjects\\Selenium\\Files\\screenshot1.png");

        closeBrowser();

    }
}
