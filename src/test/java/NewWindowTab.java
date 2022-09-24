import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.util.HashSet;
import java.util.Set;

public class NewWindowTab {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://google.com");
        String parent=driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("");
        driver.navigate().to("https://www.crmpro.com");
        driver.switchTo().window(parent);
        driver.findElement(By.linkText("Gmail")).click();
        //DevTools devTools=driver.getDevTools();
        WebElement id=driver.findElement(RelativeLocator.with(By.tagName("a")).below(By.linkText("For Work")));
        System.out.println(id.getAttribute("a"));

    }
}