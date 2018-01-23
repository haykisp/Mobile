package api.apps.bookieApp.start;

import api.android.Android;
import api.apps.bookieApp.login.Login;
import api.interfaces.Activity;
import core.MyLogger;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.NoSuchElementException;

public class Start implements Activity {

    public StartUiObjects uiObject = new StartUiObjects();

    @Override
    public Start waitToLoad() {
        try {
            MyLogger.log.info("Waiting to load Start screen");
            uiObject.signIn().waitToAppear(10);
            uiObject.createAccount().waitToAppear(10);
            uiObject.slide().waitToAppear(10);
            uiObject.slider().waitToAppear(10);
            return Android.app.bookieApp.start;
        } catch (AssertionError e) {
            throw new AssertionError("Start screen failed to load/open");
        }
    }

    public Login tapSignIn() {
        try {
            MyLogger.log.info("Tapping on the SignIn Button");
            uiObject.signIn().tap();
            return Android.app.bookieApp.login.waitToLoad();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap SignIn Button, element absent or blocked");
        }
    }

    public void tapCreateAccount() {
        try {
            MyLogger.log.info("Tapping on the CreateAccount Button");
            uiObject.createAccount().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap CreateAccount Button, element absent or blocked");
        }
    }


}
