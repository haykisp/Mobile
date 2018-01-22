package api.apps.bookieApp.start;

import core.UiObject;
import core.UiSelector;

public class StartUiObjects {
    private static UiObject
            signIn,
            createAccount,
            slide,
            slider;

    public UiObject signIn() {
        if (signIn == null) signIn = new UiSelector().text("Sign in").makeUiObject();
        return signIn;
    }

    public UiObject createAccount() {
        if (createAccount == null) createAccount = new UiSelector().text("Create Account").makeUiObject();
        return createAccount;
    }

    public UiObject slide() {
        if (slide == null)
            slide = new UiSelector().resourceId("com.betconstruct.bookie:id/tutorial_pager").makeUiObject();
        return slide;
    }

    public UiObject slider() {
        if (slider == null)
            slider = new UiSelector().resourceId("com.betconstruct.bookie:id/tab_layout/[0]").makeUiObject();
        return slider;
    }

}
