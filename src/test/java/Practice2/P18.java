package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P18 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //            perform a scroll operation
//            using java script

/*        JavascriptExecutor js=(JavascriptExecutor) driver;
//scroll down
        js.executeScript("window.scrollBy(0, 500)");
//        Thread.sleep for observation
        Thread.sleep(3000);
//        scroll up
        js.executeScript("window.scrollBy(0, -500)");*/


        JavascriptExecutor js= (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0, 500)");
        Thread.sleep(1000);

        js.executeScript("window.scrollBy(0, -500)");

        Actions action = new Actions(driver);

//        action.scrollByAmount(500)
        WebElement btn = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//        btn.click();
        js.executeScript("arguments[0].click();", btn);




    }
}
