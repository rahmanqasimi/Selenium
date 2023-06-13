package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class P11 {
    public static void main(String[] args) throws IOException {
/*        FileInputStream fis = new FileInputStream((Constants.ConfigReaderPath));
        Properties properties = new Properties();
        properties.load(fis);*/



        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22%22");
                driver.manage().window().maximize();
        WebElement username = driver.findElement(By.cssSelector("#txtUsername"));
/*        String userName=properties.getProperty("userName");
        username.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.cssSelector("#txtPassword"));
        String password=properties.getProperty("password");
        passwordField.sendKeys(password);*/

        WebElement login = driver.findElement(By.cssSelector(".button"));
        login.click();
    }
}
