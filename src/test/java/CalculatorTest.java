import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

     static AppiumDriver<MobileElement> driver;

     public static void main(String[] args) {

         try {
             openCalculator();
         } catch (Exception exp) {
             System.out.println(exp.getCause());
             System.out.println(exp.getMessage());
             exp.printStackTrace();
         }

    }

    public static void openCalculator ( ) throws Exception {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "Samsung-S10");
        cap.setCapability("udid", "R58M42SBFKL");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "10");
        cap.setCapability("automationName", "UiAutomator2");

        cap.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        cap.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

        URL url = new URL ("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);

        System.out.println("Application started!!!");
     }

}
