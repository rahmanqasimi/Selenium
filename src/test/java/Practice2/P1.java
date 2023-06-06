package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alertBtn1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertBtn1.click();
//      switch the focus of the driver to the alert

        Alert confirmAlert1 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmAlert1.accept();


        Thread.sleep(1000);
        WebElement alertBtn2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertBtn2.click();
//      switch the focus of the driver to the alert

        Alert confirmAlert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmAlert2.accept();

        Thread.sleep(1000);
        WebElement alertBtn3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn3.click();
//      switch the focus of the driver to the alert

        Alert confirmAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmAlert3.sendKeys("Hello");
        Thread.sleep(2000);
        confirmAlert3.accept();

    }
}
