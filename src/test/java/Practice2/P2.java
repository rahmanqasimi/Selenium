package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P2 extends CommonMethods {
    public static void main(String[] args) {


        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

//      task1: print animal on screen and select babycat from drop down
        driver.switchTo().frame(1);
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));

        WebElement animalDD = driver.findElement(By.xpath("//select[@id='animals']"));
        System.out.println(animal.getText());
        Select animalSelect = new Select(animalDD);
        animalSelect.selectByValue("babycat");

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame1");

        WebElement txtBox1 = driver.findElement(By.xpath("//input"));
        txtBox1.sendKeys("Hello");

        driver.switchTo().frame("frame3");

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='a']"));
        checkbox.click();

        System.out.println(driver.getWindowHandles());
    }

}
