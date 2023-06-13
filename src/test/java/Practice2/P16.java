package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P16 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
//        username.sendKeys("Tester", Keys.TAB);
        username.sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

//        Actions action = new Actions(driver);
/*        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test", Keys.ENTER);*/


    }
}
