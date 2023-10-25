package task16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question1 {
    public static void main(String[] args) {

    	WebDriverManager.chromedriver().setup();
    	
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com");

        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.navigate().refresh();

        driver.quit();
    }
}

