package frameWork;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
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

            URL url = new URL ( "http://0.0.0.0:4723/wd/hub" );

            DesiredCapabilities caps = DesiredCapabilities.android ();

            driver = new AndroidDriver ( url , caps );

            driver.manage ().timeouts ().implicitlyWait ( 60, TimeUnit.SECONDS );


            caps.setCapability ( MobileCapabilityType.PLATFORM_NAME, "Android" );

            caps.setCapability ( MobileCapabilityType.DEVICE_NAME, "DT89571CA1983101099" );

            caps.setCapability ( MobileCapabilityType.PLATFORM_VERSION, 9.0 );

            caps.setCapability ( MobileCapabilityType.APP, "C:/Users/User/Desktop/PARKWAY/paylater-full-debug-v6.0.5-2001131732.apk" );

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

