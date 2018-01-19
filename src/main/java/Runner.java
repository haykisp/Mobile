import api.android.Android;
import core.ADB;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Runner {

    public static void main(String[] args) throws MalformedURLException {
        MyLogger.log.setLevel(Level.DEBUG);
        AndroidDriver driver = null;
        try {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "BH905T5H06");
            caps.setCapability("platformName", "Android");
//            caps.setCapability("app", "/usr/local/node-v8.9.3-linux-x64/lib/node_modules/appium/node_modules/appium-unlock/bin/unlock_apk-debug.apk");
            caps.setCapability("appPackage", "com.betconstruct.bookie");
            caps.setCapability("appActivity", "com.betconstruct.bookie.activities.MainActivity");
            caps.setCapability("appWaitActivity","com.betconstruct.bookie.activities.MainActivity");
//            caps.setCapability("autoGrantPermissions", "true");
            driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            Android.driver = driver;
            ADB adb = new ADB("BH905T5H06");
            adb.openAppsActivity("package:com.betconstruct.bookie", ".activities.SplashActivity");


            UiObject buttonSignIn = new UiSelector().resourceId("com.betconstruct.bookie:id/sign_in").makeUiObject();
            buttonSignIn.waitToAppear(5).tap();


        } finally {
            if (driver != null) driver.quit();
        }

    }
}
