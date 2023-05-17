package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigates {
    public static void main(String[] args) throws InterruptedException {
//      create instance
        WebDriver driver = new ChromeDriver();
//      maximize the window
        driver.manage().window().maximize();
//      open google.com
        driver.get("https://www.google.com");
//      2 sec wait
        Thread.sleep(2000);
//      navigate to facebook.com
        driver.navigate().to("https://www.facebook.com");
//      2 sec wait
        Thread.sleep(2000);
//      refresh
        driver.navigate().refresh();
//      2 sec wait
        Thread.sleep(2000);
//      go back
        driver.navigate().back();
//      2 sec wait
        Thread.sleep(2000);
//      go forward
        driver.navigate().forward();
//      2 sec wait
        Thread.sleep(2000);
//      close the window
        driver.quit();
    }
}
