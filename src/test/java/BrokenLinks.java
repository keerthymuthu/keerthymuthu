import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {
        String homePage="http://demoqa.com/broken";
        //String homePage="http://www.hyrtutorials.com/";
        String strUrl="";
        int respCode = 200;
        HttpsURLConnection huc=null;
        WebDriverManager.chromedriver().setup();
        ChromeOptions browserOptions=new ChromeOptions();
        browserOptions.setAcceptInsecureCerts(true);
        WebDriver driver=new ChromeDriver(browserOptions);
        driver.get(homePage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> links=driver.findElements(By.tagName("a"));
        Iterator<WebElement> it=links.iterator();
        while(it.hasNext()){
            strUrl=it.next().getAttribute("href");
            System.out.println(strUrl);

            if(strUrl==null ||strUrl.isEmpty())
            {
                System.out.println("URL is either not configured for anchor tag or it is empty");
                continue;
            }
            /*if(!url.startsWith(homePage)){
                System.out.println("URL belongs to another domain, skipping it.");
                continue;
            }*/
            URL url=new URL(strUrl);
            URLConnection urlConnection=url.openConnection();
            huc= (HttpsURLConnection) urlConnection;
            //huc.setRequestMethod("HEAD");
            huc.connect();
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