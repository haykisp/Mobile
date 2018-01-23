package core.managers;

import api.android.Android;
import core.Retry;
import core.TestInfo;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

public class TestManager {

    public static TestInfo testInfo = new TestInfo();

    @Rule
    public Retry retry = new Retry(3);

    @Before
    public void before() {
        testInfo.reset();
    }

    @Rule
    public TestRule listen = new TestWatcher() {
        @Override
        public void failed(Throwable t, Description description) {
            Android.adb.takeScreenshot("aaaa");
        }

        @Override
        public void succeeded(Description description) {
        }
    };
}
