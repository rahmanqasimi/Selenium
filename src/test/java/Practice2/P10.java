package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P10 extends CommonMethods {
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

        List<WebElement> allIDs = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

        for(int i = 0; i< allIDs.size(); i++) {
            String idText = allIDs.get(i).getText();
//            id = 53502A
//            delete ID= 55891A
            if (idText.equals("53502A")) {
                WebElement idCheckBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                idCheckBox.click();
            }
/*                driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
                driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();*/
/*        List<WebElement> allIDs = new ArrayList<>();
        boolean flag = true;
        while(flag) {
            allIDs = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));

            for (int i = 0; i < allIDs.size(); i++) {
                String idText = allIDs.get(i).getText();
//            id = 53502A
//            delete ID= 55891A
                if (idText.equals("64477A")) {
                    WebElement idCheckBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i + 1) + "]/td[1]"));
                    idCheckBox.click();
                    flag = false;
                    break;
                }
                if(flag) {
                    WebElement goNext = driver.findElement(By.xpath("//a[text()='Next']"));
                    goNext.click();
                }
            }
        }*/
        }
    }
}
