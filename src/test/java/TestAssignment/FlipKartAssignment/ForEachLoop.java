package TestAssignment.FlipKartAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForEachLoop {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
        for (WebElement link : AllLinks) {
            System.out.println(link.getText() + " - " + link.getAttribute("href"));
        }
        driver.quit();
    }

}