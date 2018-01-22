package api.apps.bookieApp.login;

import core.UiObject;
import core.UiSelector;

public class LoginUiObjects {
    private static UiObject
            usernameField,
            passwordField,
            forgotPasswordButton,
            signInButton,
            createAccountButton;

    public UiObject signInButton() {
        if (signInButton == null) signInButton = new UiSelector().text("Sign in").makeUiObject();
        return signInButton;
    }

    public UiObject createAccountButton() {
        if (createAccountButton == null) createAccountButton = new UiSelector().text("Create Account").makeUiObject();
        return createAccountButton;
    }

    public UiObject usernameField() {
        if (usernameField == null)
            usernameField = new UiSelector().resourceId("com.betconstruct.bookie:id/username_edit_text").makeUiObject();
        return usernameField;
    }

    public UiObject passwordField() {
        if (passwordField == null)
            passwordField = new UiSelector().resourceId("com.betconstruct.bookie:id/password_edit_text").makeUiObject();
        return passwordField;
    }

    public UiObject forgotPasswordButton() {
        if (forgotPasswordButton == null)
            forgotPasswordButton = new UiSelector().text("Click here").makeUiObject();
        return forgotPasswordButton;
    }
}
