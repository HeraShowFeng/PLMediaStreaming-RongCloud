package com.qiniu.droid.niuliving;

import android.app.Application;

import com.bugsnag.android.Bugsnag;
import com.qiniu.pili.droid.streaming.StreamingEnv;

public class StreamingApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        /**
         * init must be called before any other func
         */
        StreamingEnv.init(getApplicationContext());
        Bugsnag.init(this);
    }
}
