import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        String homePage="https://demoqa.com/broken";
        String url="";
        int respCode = 200;
        HttpURLConnection huc=null;
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(homePage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> links=driver.findElements(By.tagName("a"));
        Iterator<WebElement> it=links.iterator();
        while(it.hasNext()){
            url=it.next().getAttribute("href");
            System.out.println(url);

            if(url==null ||url.isEmpty())
            {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            /*if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }*/
            huc= (HttpURLConnection) new URL(url).openConnection();
            huc.setRequestMethod("HEAD");
            respCode = huc.getResponseCode();
            System.out.println("Response code: "+respCode);
            if(respCode>=400)
                System.out.println(url+" is a broken link");
            else
                System.out.println(url+" is a valid link");
        }
        driver.close();
        driver.quit();
    }
}