package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class P20 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement uploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
//        to upload file, send the locations/path of the file as send keys
        uploadBtn.sendKeys("C:\\Users\\mutee\\OneDrive\\Desktop\\file.txt");

    }
}
