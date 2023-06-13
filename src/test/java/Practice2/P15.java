package Practice2;

import Utils.CommonMethods;
import class05.Alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P15 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        Actions action = new Actions(driver);

        action.contextClick(rightClickBtn).perform();

        WebElement edit = driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(edit).perform();

        Alert alert = driver.switchTo().alert();
        alert.accept();
//        driver.switchTo().alert().accept();

        WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

        action.doubleClick(doubleClick).perform();

        alert.accept();
//        driver.switchTo().alert().accept();




    }
}
