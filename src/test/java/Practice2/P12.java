package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P12 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement calendar = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

/*        WebElement month = driver.findElement(By.xpath(("//span[@class='ui-datepicker-month'])[1]")));
        String monthText = month.getText();
        WebElement year = driver.findElement(By.xpath(("//span[@class='ui-datepicker-year'])[1]")));
        String yearText = year.getText()*/;
        String currentMonth = "August";
        String currentYear = "2023";
        String dayPick  = "5";
        boolean flag = true;
        while (flag) {
            WebElement month = driver.findElement(By.xpath(("//span[@class='ui-datepicker-month'])[1]")));
            String monthText = month.getText();
            WebElement year = driver.findElement(By.xpath(("//span[@class='ui-datepicker-year'])[1]")));
            String yearText = year.getText();
            if (monthText.equals(currentMonth) && yearText.equals(currentYear)) {
            List<WebElement> calendarDays = driver.findElements(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td"));


            for(int i = 0; i< calendarDays.size(); i++){
                String day = calendarDays.get(i).getText();
                if(day.equals(dayPick)) {
//                    WebElement dayPick = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar'])[1]/tbody/tr/td[]"));
                    calendarDays.get(i).click();
                    flag = false;
                    break;
                }
                }
            }
//            next
            else {
                WebElement nextPage = driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']"));
                nextPage.click();
            }
        }
    }
}
