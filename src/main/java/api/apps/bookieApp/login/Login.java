package api.apps.bookieApp.login;

import api.android.Android;
import api.interfaces.Activity;
import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class Login implements Activity {
    public LoginUiObjects uiObject = new LoginUiObjects();

    @Override
    public Login waitToLoad() {
        try {
            MyLogger.log.info("Waiting to load Login screen");
            uiObject.usernameField().waitToAppear(10);
            uiObject.passwordField().waitToAppear(10);
            uiObject.forgotPasswordButton().waitToAppear(10);
            uiObject.signInButton().waitToAppear(10);
            uiObject.createAccountButton().waitToAppear(10);
            return Android.app.bookieApp.login;
        }catch (AssertionError e){
            throw new AssertionError("Login screen failed to load/open");
        }
    }

    public void tapSignInButton() {
        try {
            MyLogger.log.info("Tapping on the SignIn Button");
            uiObject.signInButton().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap SignIn Button, element absent or blocked");
        }
    }

    public void tapCreateAccount() {
        try {
            MyLogger.log.info("Tapping on the CreateAccount Button");
            uiObject.createAccountButton().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap CreateAccount Button, element absent or blocked");
        }
    }

    public void tapForgotPassword() {
        try {
            MyLogger.log.info("Tapping on the Forgot Password Button");
            uiObject.forgotPasswordButton().tap();
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't tap Forgot Password Button, element absent or blocked");
        }
    }

    public void writeUsername(String Text) {
        try {
            MyLogger.log.info("Writing in Username field");
//            uiObject.usernameField().tap();
            uiObject.usernameField().clearText();
            uiObject.usernameField().typeText(Text);
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't write in Username field, element absent or blocked");
        }
    }

    public void writePassword(String Text) {
        try {
            MyLogger.log.info("Writing in Password field");
//            uiObject.passwordField().tap();
            uiObject.passwordField().clearText();
            uiObject.passwordField().typeText(Text);
        } catch (NoSuchElementException e) {
            throw new AssertionError("Can't write in Password field, element absent or blocked");
        }
    }


}
