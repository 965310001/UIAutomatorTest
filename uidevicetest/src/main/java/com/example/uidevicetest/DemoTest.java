package com.example.uidevicetest;

import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.util.Log;

/**
 * Created by Administrator on 2017/1/14.
 * <p/>
 * UiDevice 主要是获取设备的的东西()
 */
public class DemoTest extends UiAutomatorTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testUiDevice();
    }




    public void testUiDevice() {
//        getUiDevice();

        getUiDevice().pressHome();

//        int height = getUiDevice().getDisplayHeight();
//        int width = getUiDevice().getDisplayWidth();
//
//        getUiDevice().pressHome();
//        Log.d("TAG", width + " " + height);
    }

}
