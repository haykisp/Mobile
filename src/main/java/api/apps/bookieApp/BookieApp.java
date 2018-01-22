package api.apps.bookieApp;

import api.android.Android;
import api.apps.bookieApp.login.Login;
import api.apps.bookieApp.start.Start;
import api.interfaces.Application;

public class BookieApp implements Application {

    public Start start = new Start();
    public Login login = new Login();

    @Override
    public void forceStop() {
        Android.adb.forceStopApp(packageId());
    }

    @Override
    public void clearData() {
        Android.adb.clearAppsData(packageId());
    }

    @Override
    public Object open() {
        Android.adb.openAppsActivity(packageId(), activityID());
        return null;
    }

    @Override
    public String packageId() {
        return "com.betconstruct.bookie";
    }

    @Override
    public String activityID() {
        return "com.betconstruct.bookie.activities.SplashActivity";
    }
}
