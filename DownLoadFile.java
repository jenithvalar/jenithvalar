import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;


public class DownLoadFile {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.leafground.com/pages/download.html");

        WebElement Excelfile = driver.findElement(By.linkText("Download Excel"));
        Excelfile.click();


        File filelocation = new File("C:\\Users\\zenith\\Downloads");
        File[] totalfiles =filelocation.listFiles();

        for (File file : totalfiles) {

            file.getName().equals("download.xls ");
            System.out.println("The file is present");

            break;
        }
    }
}

