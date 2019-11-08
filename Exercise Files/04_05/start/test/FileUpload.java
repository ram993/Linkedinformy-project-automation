import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rsenth619/Downloads/cmder/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileupload = driver.findElement(By.id("file-upload-field"));


        fileupload.sendKeys("Screenshot (1).png");

        Thread.sleep(1000);



        driver.quit();
    }
}
