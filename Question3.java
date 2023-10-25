package task16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3 {

    public static void main(String[] args) {
       
    	WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.wikipedia.org/");

        WebElement searchInput = driver.findElement(By.name("search"));
        
        searchInput.sendKeys("Artificial Intelligence");

        searchInput.submit();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement historySectionLink = driver.findElement(By.linkText("History"));
        historySectionLink.click();

        String historySectionTitle = driver.getTitle();
        System.out.println("Title of the History section: " + historySectionTitle);

        driver.quit();
    }
}


