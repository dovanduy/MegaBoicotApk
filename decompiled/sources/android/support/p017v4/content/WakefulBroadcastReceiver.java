package android.support.p017v4.content;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

@Deprecated
/* renamed from: android.support.v4.content.WakefulBroadcastReceiver */
public abstract class WakefulBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<WakeLock> f861a = new SparseArray<>();

    /* renamed from: b */
    private static int f862b = 1;

    /* renamed from: a_ */
    public static ComponentName m1235a_(Context context, Intent intent) {
        synchronized (f861a) {
            int i = f862b;
            f862b++;
            if (f862b <= 0) {
                f862b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            f861a.put(i, newWakeLock);
            return startService;
        }
    }

    /* renamed from: a */
    public static boolean m1234a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f861a) {
            WakeLock wakeLock = (WakeLock) f861a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f861a.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }
}
