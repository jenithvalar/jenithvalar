import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v96.cachestorage.model.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class InteractTables {
    public static void main(String[] args) {

        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");


            List<WebElement> StructureColumn = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
            int actStrucColSize = StructureColumn.size();

            WebElement footer = driver.findElement(By.xpath("//td[.='4 buildings']"));
            String footer_text = footer.getText();
            String num = String.valueOf(footer_text.charAt(0));
            int expectedStrucColSize = Integer.parseInt(num);
            if (actStrucColSize == expectedStrucColSize) {
                Assert.assertTrue(true);
                System.out.println("Structure column has 4 values");
            } else {
                Assert.assertTrue(false);
            }

            System.out.println(("-----------------First Taskl Completed--------------"));

            //task 2

            int column_size = driver.findElements(By.xpath("//table/thead/tr/th[@scope='col']")).size();
            int row_count = driver.findElements(By.xpath("//th[@scope='row']")).size();
            // //table/tbody/tr[1]/td[5]
            String firstpart = "//table/tbody/tr[";
            String secondpart = "]/td[";
            String thiredpart = "]";
            for (int i = 1; i < row_count; i++) {
                List<WebElement> structurs = driver.findElements(By.xpath("//tr/th[@scope='row']"));
                System.out.print(structurs.get(i).getText() + "  ");
                for (int j = 1; j < row_count; j++) {
                    String fullpath = firstpart + i + secondpart + j + thiredpart;
                    String text = driver.findElement(By.xpath(fullpath)).getText();
                    System.out.print(text + "  ");
                }
                System.out.println("");
            }


            System.out.println(("--------------Second Task Completed--------------"));

            //task 3

            List<WebElement> Burj_khalifa_Row = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]"));
            for (WebElement ele : Burj_khalifa_Row) {
                String BurjKhalifaheight = ele.getText();
                if (BurjKhalifaheight.contains("829m")) {
                    System.out.println("Expected Burj_khalifa_Height and Actual Burj_khalifa_Height are same");
                } else {
                    System.out.println("Expected Burj_khalifa_Height and Actual Burj_khalifa_Height are not same");
                }
            }

            System.out.println("-------Third Task Completed------");

            //task 4

            List<WebElement> footerhead = driver.findElements(By.xpath("//table/tfoot/tr/th"));
            List<WebElement> footercells = driver.findElements(By.xpath("//table/tfoot/tr/td"));
            int actualsixthrowColumnCount = footerhead.size() + footercells.size();
            int expsixthrowColumnCount = 2;
            if (actualsixthrowColumnCount == expsixthrowColumnCount) {
                Assert.assertTrue(true);
                System.out.println("Sixth row has Only 2 columns");
            } else {
                Assert.assertTrue(false);
            }
        }
        System.out.println("-------Fourth Task Completed------");
    }
}







