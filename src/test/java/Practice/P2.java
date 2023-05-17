package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
//        driver.findElement(By.xpath("input[@id='txtUsername]")).sendKeys("admin");
        driver.findElement(By.id("txtUsername")).sendKeys("admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("searchSystemUser_userName")).sendKeys("admin");
        driver.findElement(By.id("searchBtn")).click();

    }
}
