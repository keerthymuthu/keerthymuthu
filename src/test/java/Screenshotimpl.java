import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class Screenshotimpl {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        TakesScreenshot tks= (TakesScreenshot) driver;
        File screenshot=tks.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot,new File("src/main/resources/Screenshots/main.png"));
        WebElement ele=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        File Sel4Screenshot=ele.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Sel4Screenshot,new File("src/main/resources/Screenshots/Selenium4Screenshot.png"));
        driver.close();
        driver.quit();
    }
}