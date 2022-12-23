import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Main {
    public static void main(String[] args){


        String filePath = System.getProperty("user.dir") + "\\chromedriver.exe";
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", filePath);

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the OLX website
        driver.get("https://www.olx.pl/");

        // Find the search input element and enter the search query
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("mario odyssey");

        // Find the search button element and click it
        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
        searchButton.click();

        // Wait for the search results to load
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Find the list of search results
        List<WebElement> searchResults = driver.findElements(By.cssSelector(".wrap > .marginright5 > .link > .marginright5"));

        // Click on the first search result
        if (searchResults.size() > 0) {
            searchResults.get(0).click();
        } else {
            System.out.println("No search results found");
        }

        // Close the browser
        driver.quit();
    }

}
