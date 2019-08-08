package com.facebook.appevents;

import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.C2649m;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.facebook.appevents.b */
/* compiled from: AnalyticsUserIDStore */
class C2400b {

    /* renamed from: a */
    private static final String f7628a = "b";

    /* renamed from: b */
    private static ReentrantReadWriteLock f7629b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static String f7630c = null;

    /* renamed from: d */
    private static volatile boolean f7631d = false;

    C2400b() {
    }

    /* renamed from: a */
    public static void m9226a() {
        if (!f7631d) {
            C2436g.m9331g().execute(new Runnable() {
                public void run() {
                    C2400b.m9229d();
                }
            });
        }
    }

    /* renamed from: b */
    public static String m9227b() {
        if (!f7631d) {
            Log.w(f7628a, "initStore should have been called before calling setUserID");
            m9229d();
        }
        f7629b.readLock().lock();
        try {
            return f7630c;
        } finally {
            f7629b.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m9229d() {
        if (!f7631d) {
            f7629b.writeLock().lock();
            try {
                if (!f7631d) {
                    f7630c = PreferenceManager.getDefaultSharedPreferences(C2649m.m10133f()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    f7631d = true;
                    f7629b.writeLock().unlock();
                }
            } finally {
                f7629b.writeLock().unlock();
            }
        }
    }
}
