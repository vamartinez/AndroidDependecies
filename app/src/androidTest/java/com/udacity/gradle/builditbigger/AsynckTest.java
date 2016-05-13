package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * Created by vic on 13/05/2016.
 */
public class AsynckTest extends AndroidTestCase {

    @Test
    public void testSomething() throws Throwable {
        Assert.assertTrue(1 + 2 == 3);
    }

    @Test
    public void testCallBack() throws Throwable {
        final CountDownLatch signal = new CountDownLatch(1);
        new EndpointsAsyncTask(new EndpointsAsyncTask.AsyncResponse() {
            @Override
            public void processFinish(String output) {
                Assert.assertTrue(output != null && output.length() > 0);
                signal.countDown();
            }
        }).execute(getContext());
        signal.await();
    }
}
