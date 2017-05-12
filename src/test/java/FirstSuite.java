
import org.testng.annotations.*;

public class FirstSuite extends BaseTests {

    @Test(groups={"bbb"})
    public void firstTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - First test");
    }

    @Test(groups={"aaa"})
    public void secondTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Second test");
    }

    @Test(groups={"aaa"})
    public void thirdTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Third test");
    }

    @Test(groups={"aaa"})
    public void fifthTest() throws InterruptedException {
       getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Fourth test");
    }


}
