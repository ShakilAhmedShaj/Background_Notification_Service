package com.shaj.t3ch.servicenotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    final String TAG = "MyReceiver";

    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive");
        MyService.enqueueWork(context, new Intent());
    }
}
