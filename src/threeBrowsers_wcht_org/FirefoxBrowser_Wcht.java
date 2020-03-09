package threeBrowsers_wcht_org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowser_Wcht {                       //class

    public static void main(String[] args) {        // main method

        // defining the url to e checked
        String baseUrl = "https://www.wcht.org.uk";

        // setting up the webdriver
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // setting up the maximum view of the url, and time delay on the website to open
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);                    // getting the url for display

        // getting and printing the Title page on the url.
        String title = driver.getTitle();
        System.out.println("Main page : " + title);
        System.out.println(driver.getTitle());

        driver.quit();          // exiting after display
    }
}
