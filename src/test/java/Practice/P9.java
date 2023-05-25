package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P9 extends CommonMethods {
        public static void main(String[] args) throws InterruptedException {
//            "//input[@attribute='value' and/or @attribute='value']"
            String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
            String browser="chrome";
            openBrowserAndLaunchApplication(url,browser);

            List<WebElement> ageGroup = driver.findElements(By.xpath("//input[@name='ageGroup']"));

            String option = "5 - 15";

            Thread.sleep(2000);

            for (WebElement age: ageGroup){
                String value = age.getAttribute("value");
                if(value.equals(option)){
                    age.click();
                    break;
                }
            }

        }

}
