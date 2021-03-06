package se.jonathanb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class WebTestSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        // Prepared code if you want to use firefox.
        /*WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();*/

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Prepared code if you want to use safari.
        /*WebDriverManager.safaridriver().setup();
        driver = new SafariDriver();*/

        driver.get("https://en.wikipedia.org/wiki/Stockholm");
        System.out.println(driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        WebElement randomPage = driver.findElement(By.id("n-randompage"));
        Thread.sleep(5000);
        randomPage.click();
        System.out.println(driver.getTitle());
        Thread.sleep(5000);

        WebElement searchBox = driver.findElement(By.id("searchInput"));
        Thread.sleep(5000);
        searchBox.sendKeys("Handboll");
        WebElement searchbtn = driver.findElement(By.id("searchButton"));
        Thread.sleep(5000);
        searchbtn.click();
        System.out.println(driver.getTitle());

        Thread.sleep(10000);
        driver.quit();
    }
}