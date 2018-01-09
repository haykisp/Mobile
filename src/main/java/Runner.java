import core.MyLogger;
import core.UiSelector;
import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Level;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Runner {

    public static void main(String[] args) throws MalformedURLException {

//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("deviceName", "BH905T5H06");
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("app", "/usr/local/node-v8.9.3-linux-x64/lib/node_modules/appium/node_modules/appium-unlock/bin/unlock_apk-debug.apk");
//        caps.setCapability("appPackage", "com.facebook.katana");
//        caps.setCapability("appActivity","com.facebook.katana.LoginActivity");
//
//        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
//
////        driver.findElementByAndroidUIAutomator("new UiSelector().description(\"Apps\")").click();
//        driver.findElementByAndroidUIAutomator("new UiSelector().text").click();
//
////
//
//        driver.quit();

        MyLogger.log.setLevel(Level.ALL);
        MyLogger.log.debug("Test Debug");

    }
}
