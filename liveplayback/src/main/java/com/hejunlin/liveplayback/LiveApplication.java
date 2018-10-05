package com.hejunlin.liveplayback;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.crashreport.CrashReport;

public class LiveApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Beta.autoInit = true;
        Beta.autoCheckUpgrade = true;
        Beta.initDelay = 1000;
        Bugly.init(this.getApplicationContext(), "21da93c774", false);
        this.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

            }

            @Override
            public void onActivityStarted(Activity activity) {
                Beta.checkUpgrade(false,false);
            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {

            }
        });
    }
}
