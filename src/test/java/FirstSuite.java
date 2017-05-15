
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testdata.GoogleData;

import java.util.List;

public class FirstSuite extends BaseTests {

    @Test(groups = {"bbb"})
    public void firstTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - First test");
    }

    @Test(groups = {"bbb"})
    public void secondTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");

        Thread.sleep(5000);
        System.out.println("First Suite - Second test");
    }


    @Test(groups = {"aaa"}, dataProvider = "getSearchText", dataProviderClass = GoogleData.class)
    public void thirdTest(String key, List<String> value) throws InterruptedException {
        WebDriver wd = getWebDriver();
        wd.navigate().to("http://google.com");
        wd.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys(key + " " + value.toString());
        Thread.sleep(5000);
        wd.findElement(By.xpath(".//*[@id='lst-ib']")).clear();
        Thread.sleep(5000);
        System.out.println("First Suite - Third test");
    }

    @Test(groups = {"bbb"})
    public void fifthTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Fourth test");
    }


}
