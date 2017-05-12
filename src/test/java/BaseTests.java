import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTests {
    private WebDriver webDriver;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browserName", "platform"})
    public void setUp(String browserName, String platform) throws MalformedURLException {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setBrowserName(browserName);
            cap.setPlatform(Platform.extractFromSysProperty(platform));
            URL hostURL = new URL("http://192.168.10.61:4445/wd/hub");
            webDriver = new RemoteWebDriver(hostURL, cap);
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }

    @AfterClass
    public void tearDown() {
        getWebDriver().close();
    }

}
