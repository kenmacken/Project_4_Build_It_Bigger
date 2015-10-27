package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.test.UiThreadTest;

import java.util.concurrent.CountDownLatch;

/**
 * Created by ken on 27/10/2015.
 */
public class TestAsync extends AndroidTestCase implements EndpointsAsyncTaskListener {

    CountDownLatch signal = new CountDownLatch(1);

    @UiThreadTest
    public void testAsyncTask() {
        new EndpointsAsyncTask(this).execute();
        try {
            signal.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onResult(Object o) {
        assertTrue(o.toString() != null);
        signal.countDown();
    }
}
