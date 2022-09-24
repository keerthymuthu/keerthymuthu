import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUpload {

    public static void main(String[] args) throws AWTException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.monsterindia.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@class='uprcse semi-bold']")).click();
        //driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\ADMIN\\Desktop\\Oracle\\ETL.docx");

       // driver.findElement(By.xpath("//input[@id='file-upload']")).click();

        WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()",button);

        //StringSelection ss=new StringSelection("C:\\Users\\ADMIN\\Desktop\\Oracle\\ETL.docx");
        //Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        Robot robot=new Robot();
        robot.delay(2000);

        for(int i=0;i<1;i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        //robot.keyPress(KeyEvent.VK_ENTER);
        //robot.keyRelease(KeyEvent.VK_ENTER);

        /*robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/
    }

}
