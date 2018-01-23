import api.android.Android;
import core.MyLogger;
import core.managers.DriverManager;
import org.apache.log4j.Level;

import java.net.MalformedURLException;

public class Runner {

    public static void main(String[] args) throws MalformedURLException {
        MyLogger.log.setLevel(Level.DEBUG);
        try {
            DriverManager.createDriver();
            Android.app.bookieApp.open();
            Android.app.bookieApp.start.waitToLoad();
            Android.app.bookieApp.start.tapSignIn();
            Android.app.bookieApp.login.writeUsername("hayk.ispiryan@betconstruct.com");
            Android.app.bookieApp.login.writePassword("");
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
