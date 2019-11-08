import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;

public class ScrollToElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rsenth619/Downloads/cmder/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement fullname =driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fullname);
        fullname.sendKeys("Ram Senthil");

        sleep(1000);


        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2019");

        sleep(1000);


        driver.quit();
    }
}
