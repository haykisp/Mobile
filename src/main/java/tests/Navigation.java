package tests;

import api.android.Android;
import api.apps.bookieApp.BookieApp;
import core.managers.TestManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Navigation extends TestManager {

    private static BookieApp bookieApp = Android.app.bookieApp;

    @BeforeClass
    public static void beforClass() {
        testInfo.suite("Navigation");
        bookieApp.open();
    }

    @Test
    public void test1(){
        testInfo.id("test1").name("Verify that Start screen has all the elements");
        Assert.assertTrue(bookieApp.start.uiObject.signIn().exists());
        Assert.assertTrue(bookieApp.start.uiObject.createAccount().exists());
        Assert.assertTrue(bookieApp.start.uiObject.slide().exists());
        Assert.assertTrue(bookieApp.start.uiObject.slider().exists());
    }

//    @Test
//    public void test2(){
//        testInfo.id("").name("Ver")
//    }
}
