package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
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
//      refresh the page
        driver.navigate().refresh();
//      2 sec wait
        Thread.sleep(2000);
//      go back to the previous page
        driver.navigate().back();
//      2 sec wait
        Thread.sleep(2000);
//      go forward to the next page
        driver.navigate().forward();
//      2 sec wait
        Thread.sleep(2000);

//      close the window
        driver.quit();
    }
}
