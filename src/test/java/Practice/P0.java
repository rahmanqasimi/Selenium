package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P0 {
    public static void main(String[] args) {
//      create instance
        WebDriver driver = new ChromeDriver();
//      maximize the window
        driver.manage().window().maximize();
//      open google.com
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");


    }
}
