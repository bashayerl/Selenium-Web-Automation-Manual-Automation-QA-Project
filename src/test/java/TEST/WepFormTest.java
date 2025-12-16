package TEST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class WepFormTest {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    }

    @Test
    public void SetUp()  {

//Text input
        driver.findElement(By.xpath("//*[@id=\"my-text-id\"]")).sendKeys("hello");

 //Password
        driver.findElement(By.name("my-password")).sendKeys("1111");

//Textarea
        driver.findElement(By.name("my-textarea")).sendKeys("For testing");

//Select dropdown
        Select select = new Select(driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[1]/select")));
        select.selectByValue("2");

//Select dropdown Data list
        driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/label[2]/input")).sendKeys("Seattle");

//File upload
//        WebElement file = driver.findElement(By.name("my-file"));
//        String filePath = System.getProperty("user.dir")
//                + "/ISTQB_CTFL_Syllabus_v4.0.1.pdf";
//        file.sendKeys(filePath);

//Checkbox
        var checkbox = driver.findElement(By.xpath("//*[@id=\"my-check-1\"]"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

//Radio button
        driver.findElement(By.xpath("//*[@id=\"my-radio-2\"]")).click();

//Color picker
        WebElement colorPicker = driver.findElement(By.name("my-colors"));
        colorPicker.sendKeys("#ff0000");

//Data picker
        WebElement DataPicker = driver.findElement(By.name("my-date"));
        DataPicker.sendKeys("2025-12-1");

//Range slider
        WebElement range = driver.findElement(By.name("my-range"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value=60", range);

//submit
        driver.findElement(By.xpath("/html/body/main/div/form/div/div[2]/button")).click();


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
