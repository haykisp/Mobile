package api.apps.bookieApp.login;

import core.MyLogger;
import org.openqa.selenium.NoSuchElementException;

public class Login {
    public LoginUiObjects uiObject = new LoginUiObjects();

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
