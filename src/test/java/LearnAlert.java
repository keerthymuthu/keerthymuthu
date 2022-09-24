import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearnAlert {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.findElement(By.xpath("//li[@id='menuform:j_idt39']/a")).click();
        //driver.findElement(By.xpath("//span[text()='Alert']//parent::a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Alert']//parent::a"))).click();
    }

}
