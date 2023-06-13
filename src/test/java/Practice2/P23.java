package Practice2;


import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class P23 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        WebElement form = driver.findElement(By.xpath("//input[@name='firstname']"));
        form.sendKeys("John", Keys.TAB, "Doe", Keys.TAB, "j123343@gmail.com", Keys.TAB, "j123354@gmail.com", Keys.TAB, "J0Hnny@321&&" );

    }
}
