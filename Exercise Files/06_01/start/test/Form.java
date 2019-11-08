import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/rsenth619/Downloads/cmder/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Ram");
        Thread.sleep(1000);

        WebElement Lastname = driver.findElement(By.id("last-name"));
        Lastname.sendKeys("Senthil");

        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");

        WebElement radiobtn = driver.findElement(By.cssSelector("input[value='radio-button-3']"));
        radiobtn.click();

        WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkbox3.click();
        Thread.sleep(3000);

        WebElement select = driver.findElement(By.id("select-menu"));
        select.click();
        Thread.sleep(3000);

        WebElement option3 = driver.findElement(By.cssSelector("option[value='1']"));
        option3.click();
        Thread.sleep(3000);

        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();
        WebElement today = driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[5]"));
        today.click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));

        String alertText = alert.getText();

        assertEquals("")



        driver.quit();
    }
}
