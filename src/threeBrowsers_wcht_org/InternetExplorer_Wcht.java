package threeBrowsers_wcht_org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorer_Wcht {                      // class

    public static void main(String[] args) {        // main method

        // setting up the url
        String baseUrl = "https://www.wcht.org.uk";

        // setting up the web driver
        System.setProperty("webdriver.ie.driver", "drivers/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        // managing the maximum view and time out and deeting the url
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        // getting the title name of the page and printing it
        String title = driver.getTitle();
        System.out.println("Main page : "+title);
        System.out.println(driver.getTitle());

        driver.quit();              // exiting the url

    }
}
