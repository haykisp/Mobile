import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "BH905T5H06");
        caps.setCapability("platformName", "Android");
        caps.setCapability("app", "/usr/local/node-v8.9.3-linux-x64/lib/node_modules/appium/node_modules/appium-unlock/bin/unlock_apk-debug.apk");

        AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
        driver.quit();

    }
}
