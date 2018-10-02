package com.hejunlin.liveplayback;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class LiveApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext(), "21da93c774", false);
    }
}
