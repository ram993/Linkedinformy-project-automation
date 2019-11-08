import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rsenth619/Downloads/cmder/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
        newtabbutton.click();

        Thread.sleep(1000);

        String originalhandle = driver.getWindowHandle();

        for( String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

        Thread.sleep(1000);

        //driver.switchTo().window(originalhandle);

        driver.quit();
    }
}
