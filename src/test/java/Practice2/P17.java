package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class P17 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userNameTxtBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));

//        JavascriptExecutor js = (JavascriptExecutor) driver;
        //        JSExecutor
        JavascriptExecutor js= (JavascriptExecutor) driver;
//        script
//        the script should draw a border around the WebElement
//        js.executeScript("arguments[0].style.backgroundColor='Lime'",userNameTxtBox);

        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("admin");
//      Create a webelement for  password field and input data
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm1233");
//      Create a webelement for  login button and click
        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();

        WebElement errorMsg = driver.findElement(By.xpath("//span[@id='spanMessage']"));
        js.executeScript("arguments[0].style.backgroundColor='Lime'",errorMsg);

        js.executeScript("arguments[0].style.border='5px solid red'",errorMsg);




    }
}
