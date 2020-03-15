package frameWork;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import pages.homeScreen;

import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("rawtypes")
public class baseClass {

    static AndroidDriver driver;


    public homeScreen initializeDriver  ()  {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability("BROWSER_NAME", "Android");

            capabilities.setCapability("deviceName", "33005ad418eb835d");

            capabilities.setCapability("platformName", "Android");

            capabilities.setCapability("platformVersion", "7.1.1");

            capabilities.setCapability("appPackage", "com.lenddo.mobile.paylater.staging");

            capabilities.setCapability("appActivity", "com.lenddo.mobile.paylater.home.activity.HomeActivity");

            capabilities.setCapability("app", "src/main/resources/App/paylater-full-debug-v6.0.5-2001131732.apk");

            capabilities.setCapability("unicodeKeyboard", true);

            capabilities.setCapability("resetKeyboard", true);

            capabilities.setCapability("autoAcceptAlerts", true);

            capabilities.setCapability("autoGrantPermissions", true);

            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            driver.manage ().timeouts ().implicitlyWait ( 60, TimeUnit.SECONDS );

            System.out.println("++++++++++CARBON APP LAUNCHED++++++++++++");

            return new homeScreen (driver);

        }catch (Exception e) {
            System.out.println ( "Cause is : " +e.getCause () );

            System.out.println ( "Cause is : " +e.getMessage () );

            e.printStackTrace ();
        }
        return null;
    }

    @AfterTest
    public void closeDriver () {

        driver.close ();

    }


}

