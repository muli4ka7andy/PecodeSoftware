import net.bytebuddy.matcher.MethodSortMatcher;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class TestClass {
    private WebDriver driver;

    public TestClass(WebDriver driver) {
        this.driver = driver;
    }

    private By sendKeys = By.xpath("//input[@title='Поиск']");

    public TestClass sendKeys() {
        driver.findElement(sendKeys).sendKeys("Apple", Keys.ENTER);
        return new TestClass(driver);
    }

}
