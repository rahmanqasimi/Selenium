package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {
    public static void main(String[] args) throws InterruptedException {
//        create instance
        WebDriver driver = new ChromeDriver();
//        maximize the page
        driver.manage().window().maximize();
//        navigate to the page
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
//      creating WebElement and putting using name textbox in it
        WebElement usrNameTxtBox = driver.findElement(By.id("txtUsername"));
//        send Admin to the webelement
        usrNameTxtBox.sendKeys("Admin");

//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        1sec pause
        Thread.sleep(1000);
//        clear the usrNameTxtBox
        usrNameTxtBox.clear();
//        driver.findElement(By.id("txtUsername")).clear();
//        1sec pause
        Thread.sleep(1000);
//        send Admin to the webelement
        usrNameTxtBox.sendKeys("Admin");
//        Find the password text box
        WebElement pass = driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
//      create web element for login button
        WebElement loginButton = driver.findElement(By.className("button"));
//      click on the login button
        loginButton.click();
//    create a web element for the anchor
        WebElement welcomeAdmin = driver.findElement(By.linkText("Welcome Admin"));
//      getting text from the anchor and store it in welcomeAd
        String welcomeAd = welcomeAdmin.getText();
//      print out the text
        System.out.println(welcomeAd);
//      click welcome admin
//        welcomeAdmin.click();
//
        WebElement recuit = driver.findElement(By.partialLinkText("Recru"));
        recuit.click();
//        6sec pause
        Thread.sleep(6000);
//        close the tab
        driver.close();
    }
}
