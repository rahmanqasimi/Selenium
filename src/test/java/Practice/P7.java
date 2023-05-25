package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P7 {
    public static void main(String[] args) throws InterruptedException {
//        open chrome browser and maximize
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        open the practise page
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//      Create a webelement for  username field and input data
        WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        username.sendKeys("admin");
//      Create a webelement for  password field and input data
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
//      Create a webelement for  login button and click
        WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

        driver.findElement(By.xpath("//a[@data-testid,"));


/*//      pause for 8 sec
        Thread.sleep(8000);
//        close the tab
        driver.close();*/
    }
}

