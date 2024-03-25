package TestAssignment.FlipKartAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
        List<String> AllLinks_href = AllLinks.stream()
                .map(link -> link.getAttribute("href"))
                .collect(Collectors.toList());
        AllLinks_href.forEach(System.out::println);
        driver.quit();
    }
}

