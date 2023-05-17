package Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
//      create instance
        WebDriver driver = new ChromeDriver();
//      maximize the page
        driver.manage().window().maximize();
//      navigate to the link
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
//      find Username text box and fill
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
//      find Password text box and fill
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
//      getting the title of the page
        String title = driver.getTitle();
//      confimring if the title of the page is "Web Orders Login"
        if (title.equals("Web Orders Login")){
            System.out.println("The title of the page is correct and it is: "+title);
        }
        else {
            System.out.println("The Title of the page is incorrect");
        }
//      find login button and click it
        driver.findElement(By.className("button")).click();
//        wait 5 seconds
        Thread.sleep(5000);
//      Close the tab
        driver.close();



    }
}
