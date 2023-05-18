package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        //      create instance
        WebDriver driver = new ChromeDriver();
//      maximize the page
        driver.manage().window().maximize();
//      navigate to the link
        driver.get("https://www.facebook.com");
//      find and click on create new account using xpath
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//        2 sec sleep
        Thread.sleep(2000);
//        Create web element for First name text box and send info
        WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
        fName.sendKeys("John");
//        Create web element for Last name text box and send info
        WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lName.sendKeys("Doe");
//        Create web element for PHone number or email text box and send info
        WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("johndoe123456@gmail.com");
//        1 sec sleep so the new field appears
        Thread.sleep(1000);
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
//      click the Sign Up button
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
//      10 sec sleep
        Thread.sleep(10000);
//      close the tab
        driver.close();

    }
}
