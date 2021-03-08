import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class PecodeSoftware {
    private WebDriver driver;
    private TestClass testClass;

    @Before
    public void setUp() {
        System.setProperty("webdriver.opera.driver", "C:\\Users\\Андрей\\operadriver_win64\\operadriver.exe");
        driver = new OperaDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        testClass = new TestClass(driver);
    }

    @Test
    public void test1() {
        testClass.sendKeys();
        String actualTitle = driver.getTitle();
        System.out.println("The response title is: " + actualTitle);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
