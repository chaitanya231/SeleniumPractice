import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {


    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");



        System.out.println();
    }
}
