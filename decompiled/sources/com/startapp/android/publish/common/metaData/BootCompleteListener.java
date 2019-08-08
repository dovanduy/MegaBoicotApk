package com.startapp.android.publish.common.metaData;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.android.publish.adsCommon.Utils.C5297b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.p193a.C5518g;

/* compiled from: StartAppSDK */
public class BootCompleteListener extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            C5518g.m23561a(3, "BootCompleteListener - onReceive");
            long elapsedRealtime = SystemClock.elapsedRealtime() + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            C5297b.m22615a(context);
            C5297b.m22618a(context, Long.valueOf(elapsedRealtime));
            C5297b.m22617a(context, elapsedRealtime);
        } catch (Exception e) {
            C5378f.m23016a(context, C5376d.EXCEPTION, "BootCompleteListener.onReceive - failed to start services", e.getMessage(), "");
        }
    }
}
