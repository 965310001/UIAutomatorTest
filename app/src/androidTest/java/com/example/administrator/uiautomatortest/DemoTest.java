package com.example.administrator.uiautomatortest;

import android.os.RemoteException;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.util.Log;
import android.view.KeyEvent;

import java.io.File;

/**
 * Created by Administrator on 2016/12/28.
 */
public class DemoTest extends UiAutomatorTestCase {


    @Override
    protected void setUp() throws Exception {
        super.setUp();
        testPack();
    }

    public void testPack() throws UiObjectNotFoundException, RemoteException, InterruptedException {
//        getUiDevice().pressBack();
//        getUiDevice().pressHome();
//             getUiDevice();
//        getUiDevice().pressMenu();
//        Log.d("pag",getUiDevice().getCurrentPackageName());
//
////        System.out.print(getUiDevice().getCurrentPackageName());  //包名
//
//        String currentPackageName = getUiDevice().getCurrentPackageName();
//
//        String currentActivityName = getUiDevice().getCurrentActivityName();
//
//        int displayHeight = getUiDevice().getDisplayHeight();
//        int displayWidth = getUiDevice().getDisplayWidth();
//
//        //设备的名字
//        String productName = getUiDevice().getProductName();
//
//        int displayRotation = getUiDevice().getDisplayRotation();
//
//        boolean screenOn = getUiDevice().isScreenOn();
//
//        //截图
//        getUiDevice().takeScreenshot(new File("D://a.png"));
//
//
//        System.err.println(currentPackageName);
//
//        System.err.print(getUiDevice().getDisplayHeight());
//
//        Log.e("pag",getUiDevice().getDisplayHeight()+"");
//
//
//        //点击事件的相关
//        getUiDevice().click(60,60);
//        getUiDevice().pressBack();
//        getUiDevice().pressHome();
//        getUiDevice().pressMenu();
//        getUiDevice().pressDelete();
//
//        getUiDevice().pressDPadDown();
//        getUiDevice().pressDPadLeft();
//        getUiDevice().pressDPadRight();
//        getUiDevice().pressEnter();
//
////        getUiDevice().pressKeyCode();

//        getUiDevice().pressSearch();

        //监听器的相关
        //旋转相关
        //系统相关


//        getUiDevice();
//        UiSelector mUiSelector;
//        UiObject mUiObject;
//
//        mUiSelector = new UiSelector().text("a");
//        mUiObject = new UiObject(mUiSelector);
//        mUiObject.clickAndWaitForNewWindow();


//        mUiObject.dragTo(getUiDevice().getDisplayWidth()/2,
//                getUiDevice().getDisplayHeight()/2,100);

//        mUiObject.swipeDown(100);
//        mUiObject.swipeLeft(100);
//        mUiObject.swipeRight(500);
//        mUiObject.swipeUp(100);

//        mUiObject.getText();
//        mUiObject.setText("郭枫");


//        getUiDevice().pressRecentApps();
//
//
//        getUiDevice().openNotification();
//        getUiDevice().openQuickSettings();
//        getUiDevice().getCurrentPackageName()l
//        sleep(5);
//        getUiDevice().openQuickSettings();

        getUiDevice().pressRecentApps();
        getUiDevice().pressHome();


        getUiDevice().swipe(getUiDevice().getDisplayWidth()/3*2,
                getUiDevice().getDisplayHeight()/5*4,
                getUiDevice().getDisplayWidth()/6,
                getUiDevice().getDisplayHeight()/5*4,
                100);
    }

}
