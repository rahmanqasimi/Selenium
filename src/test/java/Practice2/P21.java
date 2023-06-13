package Practice2;


import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class P21 extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//        loginBtn.click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);

        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(screenshot, new File("C:\\Users\\mutee\\IdeaProjects\\Selenium\\Files\\screenshot.png"));

    }
}
