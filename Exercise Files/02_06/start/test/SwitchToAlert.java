import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rsenth619/Downloads/cmder/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertbtn = driver.findElement(By.id("alert-button"));
        alertbtn.click();

        Thread.sleep(1000);

        Alert alert = driver.switchTo().alert();
        alert.accept();



        driver.quit();
    }
}
