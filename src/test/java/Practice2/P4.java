package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class P4 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));


        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
        fName.sendKeys("John");
//        Create web element for Last name text box and send info
        WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
        sendText("Doe",lName);
//        lName.sendKeys("Doe");
//        Create web element for PHone number or email text box and send info
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("johndoe123456@gmail.com");
//        1 sec sleep so the new field appears
//        Create web element for PHone number or re enter email text box and send info
        WebElement conEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        conEmail.sendKeys("johndoe123456@gmail.com");
//        Create web element for New password text box and send info
        WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        pass.sendKeys("J0Hnny@321&&");
//      select Birth day from the dropdown menu
//      create instance for the select month
        Select dropMonth = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
        dropMonth.selectByVisibleText("Feb");
//      create instance for the select day
        Select dropDay = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        dropDay.selectByVisibleText("14");
//      create instance for the select year
        Select dropYear = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
        dropYear.selectByValue("2000");
//      Select the radio buttons for Gender by clicking the male
        driver.findElement(By.xpath("//label[text()='Male']")).click();

    }
}
