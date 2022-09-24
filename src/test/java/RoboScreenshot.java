import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RoboScreenshot {

    public static void main(String[] args) throws AWTException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        Robot robotObject =new Robot();
        Rectangle screenSize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage bufferedImage=robotObject.createScreenCapture(screenSize);
        ImageIO.write(bufferedImage,"jpg",new File("src/main/resources/Screenshots/Timestamp.jpg"));
        driver.close();
        driver.quit();
    }
}
