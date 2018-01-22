import api.android.Android;
import core.MyLogger;
import core.UiObject;
import core.UiSelector;
import core.managers.DriverManager;
import org.apache.log4j.Level;

import java.net.MalformedURLException;

public class Runner {

    public static void main(String[] args) throws MalformedURLException {
        MyLogger.log.setLevel(Level.DEBUG);

        Android.app.bookieApp.start.tapSignIn();
        Android.app.bookieApp.login.writeUsername("hayk.ispiryan@betconstruct.com");
        Android.app.bookieApp.login.writePassword("");

        try {
            DriverManager.createDriver();
            Android.adb.openAppsActivity("com.betconstruct.bookie", "com.betconstruct.bookie.activities.SplashActivity");
            UiObject buttonSignIn = new UiSelector().resourceId("com.betconstruct.bookie:id/sign_in").makeUiObject();
            buttonSignIn.waitToAppear(5).tap();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        } finally {
            Android.driver.pressKeyCode(3);
            DriverManager.killDriver();
        }

    }
}
