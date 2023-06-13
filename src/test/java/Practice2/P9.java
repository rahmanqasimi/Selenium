package Practice2;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P9 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        driver.manage().window().minimize();


        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        WebElement pimBtn =  driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
        pimBtn.click();
//        print the row that has 56258A
        //table[@id="resultTable"]/tbody/tr/td[2]
        List<WebElement> tableIDRow = driver.findElements(By.xpath(" //table[@id='resultTable']/tbody/tr/td[2]"));

        for(int i = 0; i< tableIDRow.size(); i++){
            String data = tableIDRow.get(i).getText();
//            System.out.println(data);
            if (data.contains("56258A")){
                System.out.println("Row number is :"+(i+1));
                WebElement row = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+(i+1)+"]"));
                System.out.println(data);
                System.out.println(row.getText());
            }
        }

        List<WebElement> tableAllRow = driver.findElements(By.xpath(" //table[@id='resultTable']/tbody/tr"));

/*        for (int i = 0; i < tableAllRow.size(); i++){
            String data = tableAllRow.get(i).getText();
//            System.out.println(data);
            if (data.contains("56247A")){
                System.out.println("Row number is :"+(i+1));
                System.out.println(data);
            }
        }*/


        List<WebElement> header = driver.findElements(By.xpath("//table[@id='resultTable']/thead/tr/th"));

        List<Map<String, String>> table = new ArrayList<>();
        //table[@id='resultTable']/thead/tr    - header
        for(int i =0; i < tableAllRow.size(); i++)
        {

            Map<String, String> rowData = new HashMap<>();
            List<WebElement> cellData = driver.findElements(By.xpath(" //table[@id='resultTable']/tbody/tr["+(i+1)+"]/td"));
            for (int j = 0; j <cellData.size(); j++){
                String headerKey = header.get(j).getText();
                rowData.put(headerKey,cellData.get(j).getText());
            }
        table.add(rowData);
        }
        System.out.println("\n\n\n");
        for (Map<String, String> value: table){
            System.out.println(value);

        }

//        driver.manage().window().minimize();
//        System.out.println("Table");
//        find whole table
/*        WebElement customerTable =  driver.findElement(By.xpath("//table[@id='customers']"));
        String customerTableText = customerTable.getText();
        System.out.println(customerTableText);*/


    }
}
