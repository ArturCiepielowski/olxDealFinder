import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filter {

    public static void filter(WebDriver driver){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement cheapFilter= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[3]/div/div[3]/div/div/div"));
        cheapFilter.click();

        WebElement cheapFilter2= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[3]/div/div[3]/div/div/div[2]/div[2]/div[3]"));
        cheapFilter2.click();


        WebElement lowPrice= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[1]/div/div[2]/div/div[1]/div/div/div/input"));
        lowPrice.sendKeys("100");

        WebElement highPrice= driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/form/div[3]/div[1]/div/div[2]/div/div[2]/div/div/div/input"));
        highPrice.sendKeys("170");
    }

}
