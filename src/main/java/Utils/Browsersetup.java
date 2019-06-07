package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import sun.plugin2.message.Message;

public class Browsersetup {

    public WebDriver driver;
    private Object Message;

    public void OpenChrome(){

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
    }

    public void openFirefox(){

        WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
    }

    public void openMyTestEnv(String Url){
        openFirefox();
        driver.get(Url);
    }
    public void printmessage (String Message){
        System.out.println(Message);
    }
    public  void closeBrowser(){
        driver.quit();
    }
}
