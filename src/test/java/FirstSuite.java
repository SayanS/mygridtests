
import org.testng.annotations.*;

public class FirstSuite extends BaseTests {

    @Test
    public void firstTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - First test");
    }

    @Test
    public void secondTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Second test");
    }

    @Test
    public void thirdTest() throws InterruptedException {
        getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Third test");
    }

    @Test
    public void fifthTest() throws InterruptedException {
       getWebDriver().navigate().to("http://google.com");
        Thread.sleep(5000);
        System.out.println("First Suite - Fourth test");
    }


}
