package tests;

import api.android.Android;
import api.apps.bookieApp.BookieApp;
import core.managers.TestManager;
import org.junit.Assert;
import org.junit.Test;

public class Functionality extends TestManager {

    private static BookieApp bookieApp = Android.app.bookieApp;

    @Test
    public void test3() {
        testInfo.id("test3").name("Verify that Start screen has all the elements");
        Assert.assertTrue(bookieApp.start.uiObject.signIn().exists());
        Assert.assertTrue(bookieApp.start.uiObject.createAccount().exists());
        Assert.assertTrue(bookieApp.start.uiObject.slide().exists());
        Assert.assertTrue(bookieApp.start.uiObject.slider().exists());
    }
}
