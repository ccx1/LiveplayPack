package com.hejunlin.liveplayback;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

public class LiveApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Beta.autoInit = true;
        Beta.autoCheckUpgrade = true;
        Beta.initDelay = 1 * 1000;
        Bugly.init(this.getApplicationContext(), "21da93c774", false);
    }
}
