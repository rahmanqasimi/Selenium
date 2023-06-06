package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class P3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://accounts.google.com/signup";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement helpBtn = driver.findElement(By.xpath("//a[text()='Help']"));
        helpBtn.click();

        WebElement privacyBtn = driver.findElement(By.xpath("//a[text()='Privacy']"));
        privacyBtn.click();

        WebElement termsBtn = driver.findElement(By.xpath("//a[text()='Terms']"));
        termsBtn.click();

//      get the window handle of the main page
        String mainWindowHandle = driver.getWindowHandle();
        System.out.println("Main page handle is :"+mainWindowHandle);

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
//            System.out.println("The title associated with "+handle+" is :"+title);
            if(title.equalsIgnoreCase("Google Account Help")){
                break;
            }
        }
        System.out.println("The current page in focus is: "+driver.getTitle());
//        System.out.println(driver.getWindowHandles());
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().window(mainWindowHandle);
        System.out.println("The current page in focus is: "+driver.getTitle());


    }
}
