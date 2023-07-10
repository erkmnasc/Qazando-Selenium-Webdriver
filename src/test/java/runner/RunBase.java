package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RunBase {

    static WebDriver driver;

    public enum Browser {CHROME, FIREFOX, EDGE}

    public static WebDriver getDriver() {

        if (driver == null) {
            return getDriver(Browser.CHROME);
        } else {
            return driver;
        }
    }

    public static WebDriver getDriver(Browser browser) {

        if (driver !=  null) {
            driver.quit();
        }

        switch (browser) {
            case CHROME:
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case EDGE:
                driver = new EdgeDriver();
            default:
                throw new IllegalArgumentException("Navegador não encontrado! Passe um navegador existente: Chrome, Firefox ou Edge.");
        }

        if(driver != null){
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        }

        return driver;
    }

}