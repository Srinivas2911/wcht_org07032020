package threeBrowsers_wcht_org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowser_Wcht {

    public static void main(String[] args) {
        // defining the url
        String baseUrl = "https://www.wcht.org.uk";
        // setting up the web drivers
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // managing window size to maximum
        driver.manage().window().maximize();
        // window opening time defined
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // getting the base Url
        driver.get(baseUrl);

        //getting title page
        String title = driver.getTitle();
        System.out.println("Main page : " + title);  // prints title main
        System.out.println(driver.getTitle());      // prints title name

        driver.quit();          // exits the url

    }
}
