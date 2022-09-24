
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;

public class DCTest {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.setPlatformName("Windows 10");
        options.setBrowserVersion("93");
        WebDriver driver=new ChromeDriver(options);
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
        Actions actions=new Actions(driver);
        driver.switchTo().frame("callout");
        WebElement no=driver.findElement(By.xpath("//button[text()='No thanks']"));
        actions.click(no).build().perform();
    }

}
