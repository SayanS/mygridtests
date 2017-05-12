import org.testng.annotations.Test;

public class SecondSuite extends BaseTests{
    @Test
    public void firstTest() throws InterruptedException {
        getWebDriver().navigate().to("http://mail.ru");
        Thread.sleep(5000);
        System.out.println("Second Suite - First test");
    }

    @Test
    public void secondTest() throws InterruptedException {
        getWebDriver().navigate().to("http://mail.ru");
        Thread.sleep(5000);
        System.out.println("Second Suite - Second test");
    }

    @Test
    public void thirdTest() throws InterruptedException {
        getWebDriver().navigate().to("http://mail.ru");
        Thread.sleep(5000);
        System.out.println("Second Suite - Third test");
    }

    @Test
    public void fifthTest() throws InterruptedException {
        getWebDriver().navigate().to("http://mail.ru");
        Thread.sleep(5000);
        System.out.println("Second Suite - Fourth test");
    }
}
