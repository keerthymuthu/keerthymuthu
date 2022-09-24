import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelLocators {

    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
       // driver.get("https://automationbookstore.dev/");
        driver.get("https://applitools.com/blog/selenium-4/");
        driver.manage().window().maximize();
       /* String id = driver.findElement(with(By.tagName("li"))
                .toLeftOf(driver.findElement(By.id("pid6")))
                .below(By.id("pid1")))
                .getAttribute("id");*/
       //List<WebElement> id=driver.findElements(with(By.tagName("li"))
       //.toLeftOf(By.id("pid7")));
       // List<WebElement> id=driver.findElements(with(By.tagName("li"))
         //       .above(By.id("pid5")));
       // List<WebElement> id=driver.findElements(with(By.tagName("li"))
         //       .below(By.id("pid1")));

        //WebElement id=driver.findElement(with(By.tagName("li"))
        //.below(driver.findElement(By.id("pid2"))).toRightOf(By.id("pid5")));
        WebElement id=driver.findElement(with(By.linkText("Get Started"))
        .below(By.id("login-item")));
        System.out.println(id.getText());



        System.out.println(id.getAttribute("id"));


    }

}
