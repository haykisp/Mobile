package tests;

import api.android.Android;
import api.apps.bookieApp.BookieApp;
import core.managers.TestManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Navigation extends TestManager {

    private static BookieApp bookieApp = Android.app.bookieApp;

    @BeforeClass
    public static void beforeClass() {
        testInfo.suite("Navigation");
        bookieApp.open();
        bookieApp.start.waitToLoad();

    }

    @Before
    public void before(){
        testInfo.suite("Navigation");
    }

    @Test
    public void test1() {
        testInfo.id("test1").name("Verify that Start screen has all the elements");
        Assert.assertTrue(bookieApp.start.uiObject.signIn().exists());
        Assert.assertTrue(bookieApp.start.uiObject.createAccount().exists());
        Assert.assertTrue(bookieApp.start.uiObject.slide().exists());
        Assert.assertTrue(bookieApp.start.uiObject.slider().exists());
    }

    @Test
    public void test2() {
        testInfo.id("test2").name("Verify that Login screen has all the elements");
        bookieApp.start.tapSignIn();
        Assert.assertTrue(bookieApp.login.uiObject.usernameField().exists());
        Assert.assertTrue(bookieApp.login.uiObject.passwordField().exists());
        Assert.assertTrue(bookieApp.login.uiObject.forgotPasswordButton().exists());
        Assert.assertTrue(bookieApp.login.uiObject.signInButton().exists());
        Assert.assertTrue(bookieApp.login.uiObject.createAccountButton().exists());
    }
}
