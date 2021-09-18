package getirSelenium;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    WebDriver wdriver = new FirefoxDriver();

    @Before
    public void startPage() {

        System.setProperty("webdriver.gecko.driver"," 'Path'\\geckodriver.exe");
        String url ="https://training.qastorming.com/";
        wdriver.get(url);
        wdriver.manage().window().maximize();
        wdriver.manage().deleteAllCookies();
    }
    @After
    public void quitPage() throws InterruptedException {

        Thread.sleep(3000);
        wdriver.close();
    }
}
