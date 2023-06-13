package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P11 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement pimBtn =  driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
        pimBtn.click();

        List<WebElement> allIDs = new ArrayList<>();
//        allIDs = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        boolean flag = true;
        while(flag) {
            allIDs = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < allIDs.size(); i++) {
                String idText = allIDs.get(i).getText();
//            id = 64477A
                if (idText.equals("64477A")) {
                    WebElement idCheckBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    idCheckBox.click();
                    flag = false;
                    break;
                }
            }
            if(flag) {
            WebElement goNext = driver.findElement(By.xpath("//a[text()='Next']"));
            goNext.click();
//            we should populate the List inside the loop so it copies data from every page
            }
        }
    }
}
