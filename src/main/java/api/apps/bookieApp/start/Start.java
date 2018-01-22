package api.apps.bookieApp.start;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class Start {
    public StartUiObjects uiObject = new StartUiObjects();

    public void tapSignIn() {
        try {
            MyLogger.log.info("Tapping on the SignIn Button");
            uiObject.signIn().tap();
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
