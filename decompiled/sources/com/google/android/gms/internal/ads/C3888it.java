package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import javax.annotation.concurrent.GuardedBy;

@C3718cm
/* renamed from: com.google.android.gms.internal.ads.it */
public final class C3888it {

    /* renamed from: a */
    int f13347a = -1;

    /* renamed from: b */
    private long f13348b = -1;

    /* renamed from: c */
    private long f13349c = -1;
    @GuardedBy("mLock")

    /* renamed from: d */
    private int f13350d = -1;

    /* renamed from: e */
    private long f13351e = 0;

    /* renamed from: f */
    private final Object f13352f = new Object();

    /* renamed from: g */
    private final String f13353g;
    @GuardedBy("mLock")

    /* renamed from: h */
    private int f13354h = 0;
    @GuardedBy("mLock")

    /* renamed from: i */
    private int f13355i = 0;

    public C3888it(String str) {
        this.f13353g = str;
    }

    /* renamed from: a */
    private static boolean m17010a(Context context) {
        int identifier = context.getResources().getIdentifier("Theme.Translucent", TtmlNode.TAG_STYLE, "android");
        if (identifier != 0) {
            try {
                if (identifier == context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                    return true;
                }
                C3900je.m17433d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                return false;
            } catch (NameNotFoundException unused) {
                C3900je.m17435e("Fail to fetch AdActivity theme");
            }
        }
        C3900je.m17433d("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        return false;
    }

    /* renamed from: a */
    public final Bundle mo15458a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f13352f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f13353g);
            bundle.putLong("basets", this.f13349c);
            bundle.putLong("currts", this.f13348b);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f13350d);
            bundle.putInt("preqs_in_session", this.f13347a);
            bundle.putLong("time_in_session", this.f13351e);
            bundle.putInt("pclick", this.f13354h);
            bundle.putInt("pimp", this.f13355i);
            bundle.putBoolean("support_transparent_background", m17010a(context));
        }
        return bundle;
    }

    /* renamed from: a */
    public final void mo15459a() {
        synchronized (this.f13352f) {
            this.f13354h++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15460a(com.google.android.gms.internal.ads.zzjj r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f13352f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.io r1 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.jg r1 = r1.mo15449l()     // Catch:{ all -> 0x0091 }
            long r1 = r1.mo15507i()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.C3025aw.m10924l()     // Catch:{ all -> 0x0091 }
            long r3 = r3.mo13694a()     // Catch:{ all -> 0x0091 }
            long r5 = r10.f13349c     // Catch:{ all -> 0x0091 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004b
            long r5 = r3 - r1
            com.google.android.gms.internal.ads.ark<java.lang.Long> r1 = com.google.android.gms.internal.ads.aru.f11784aI     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.ars r2 = com.google.android.gms.internal.ads.aoq.m14620f()     // Catch:{ all -> 0x0091 }
            java.lang.Object r1 = r2.mo14695a(r1)     // Catch:{ all -> 0x0091 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0091 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x0091 }
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x0039
            r1 = -1
            r10.f13347a = r1     // Catch:{ all -> 0x0091 }
            goto L_0x0047
        L_0x0039:
            com.google.android.gms.internal.ads.io r1 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.jg r1 = r1.mo15449l()     // Catch:{ all -> 0x0091 }
            int r1 = r1.mo15508j()     // Catch:{ all -> 0x0091 }
            r10.f13347a = r1     // Catch:{ all -> 0x0091 }
        L_0x0047:
            r10.f13349c = r12     // Catch:{ all -> 0x0091 }
            long r12 = r10.f13349c     // Catch:{ all -> 0x0091 }
        L_0x004b:
            r10.f13348b = r12     // Catch:{ all -> 0x0091 }
            r12 = 1
            if (r11 == 0) goto L_0x0061
            android.os.Bundle r13 = r11.f14527c     // Catch:{ all -> 0x0091 }
            if (r13 == 0) goto L_0x0061
            android.os.Bundle r11 = r11.f14527c     // Catch:{ all -> 0x0091 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0091 }
            if (r11 != r12) goto L_0x0061
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return
        L_0x0061:
            int r11 = r10.f13350d     // Catch:{ all -> 0x0091 }
            int r11 = r11 + r12
            r10.f13350d = r11     // Catch:{ all -> 0x0091 }
            int r11 = r10.f13347a     // Catch:{ all -> 0x0091 }
            int r11 = r11 + r12
            r10.f13347a = r11     // Catch:{ all -> 0x0091 }
            int r11 = r10.f13347a     // Catch:{ all -> 0x0091 }
            if (r11 != 0) goto L_0x007f
            r11 = 0
            r10.f13351e = r11     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.io r11 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.jg r11 = r11.mo15449l()     // Catch:{ all -> 0x0091 }
            r11.mo15491b(r3)     // Catch:{ all -> 0x0091 }
            goto L_0x008f
        L_0x007f:
            com.google.android.gms.internal.ads.io r11 = com.google.android.gms.ads.internal.C3025aw.m10921i()     // Catch:{ all -> 0x0091 }
            com.google.android.gms.internal.ads.jg r11 = r11.mo15449l()     // Catch:{ all -> 0x0091 }
            long r11 = r11.mo15509k()     // Catch:{ all -> 0x0091 }
            long r1 = r3 - r11
            r10.f13351e = r1     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            return
        L_0x0091:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3888it.mo15460a(com.google.android.gms.internal.ads.zzjj, long):void");
    }

    /* renamed from: b */
    public final void mo15461b() {
        synchronized (this.f13352f) {
            this.f13355i++;
        }
    }
}
