package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P8 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().window().minimize();
        System.out.println("Table");
//        find whole table
        WebElement customerTable =  driver.findElement(By.xpath("//table[@id='customers']"));
        String customerTableText = customerTable.getText();
        System.out.println(customerTableText);
        System.out.println("\n Rows");


//        Rows of the table
        List<WebElement> customerTableRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row: customerTableRows){
            String rowText = row.getText();
            if(rowText.contains("Google")){
                System.out.println(rowText);
            }
        }
/*        System.out.println("\n\n\n");
        for(int i = 0; i < customerTableRows.size(); i++){
            System.out.println(customerTableRows.get(i).getText());
        }
        System.out.println("\n\n\n");*/
//        print columns
        System.out.println("\n Columns and Rows");
        List <WebElement> customerTableIntoCols = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));

/*
        customerTableCols.add(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]")));
*/

        for (WebElement cell: customerTableIntoCols) {
            String cellText = cell.getText();
            System.out.println(cellText);
        }


    }
}
