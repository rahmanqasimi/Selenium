package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {
    public static void main(String[] args) {
//        create instance
        WebDriver driver = new ChromeDriver();
//        maximize the window
        driver.manage().window().maximize();
//        open facebook.com
        driver.get("https://www.facebook.com");
//        find email text box and send abc@gmail.com
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
//        find password text box and send abcabcabc
        driver.findElement(By.id("pass")).sendKeys("abcabcabc");
//        find the login button and click
        driver.findElement(By.name("login")).click();

    }
}
