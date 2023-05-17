package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw1 {
    public static void main(String[] args) throws InterruptedException {
//        create instance
        WebDriver driver = new ChromeDriver();
//        maximize
        driver.manage().window().maximize();
//        navigate to the link
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
//        find First Name text box and fill
        driver.findElement(By.id("customer.firstName")).sendKeys("John");
//      find Last Name text box and fill
        driver.findElement(By.id("customer.lastName")).sendKeys("Doe");
//      find Address text box and fill
        driver.findElement(By.id("customer.address.street")).sendKeys("1234 Main St");
//      find City text box and fill
        driver.findElement(By.id("customer.address.city")).sendKeys("Herndon");
//      find State text box and fill
        driver.findElement(By.id("customer.address.state")).sendKeys("Virginia");
//      find Zip Code text box and fill
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("20170");
//      find Phone # text box and fill
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("7037037030");
//      find SSN and text box fill
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
//      find Username text box and fill
        driver.findElement(By.id("customer.username")).sendKeys("johndoe");
//      find Password text box and fill
        driver.findElement(By.id("customer.password")).sendKeys("J@oHnnY!@#123");
//      find confirm Password text box and fill
        driver.findElement(By.id("repeatedPassword")).sendKeys("J@oHnnY!@#123");
//      find register button and click it
        driver.findElement(By.className("button")).click();
//        wait 5 seconds
        Thread.sleep(5000);
//      Close the tab
        driver.close();
    }
}
