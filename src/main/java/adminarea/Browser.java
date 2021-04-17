package adminarea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static WebDriver driver;


    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    public static void quit() {
        Browser.driver.quit();
    }
}
