import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ToolTip {
    public static void main(String[] args) throws InterruptedException, AWTException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
//
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
//        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

        WebElement Name = driver.findElement(By.xpath("//a[contains(text(),'Games')]"));
        Name.sendKeys(Keys.PAGE_DOWN  );
        Thread.sleep(2000);
        Name.sendKeys(Keys.PAGE_UP);
        String ToolTipText= Name.getAttribute("title");
        System.out.println(ToolTipText);

    }
}

