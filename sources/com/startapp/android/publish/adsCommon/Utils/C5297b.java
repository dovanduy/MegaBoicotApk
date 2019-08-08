package com.startapp.android.publish.adsCommon.Utils;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.startapp.android.publish.adsCommon.C5414k;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.android.publish.common.metaData.C5482e;
import com.startapp.android.publish.common.metaData.C5484f;
import com.startapp.android.publish.common.metaData.MetaData;
import com.startapp.common.p193a.C5518g;
import com.startapp.common.p194b.C5527a;
import com.startapp.common.p194b.C5537b.C5539a;
import com.startapp.common.p194b.p195a.C5532a;
import com.startapp.common.p194b.p195a.C5533b;
import com.startapp.common.p194b.p195a.C5536c;

/* renamed from: com.startapp.android.publish.adsCommon.Utils.b */
/* compiled from: StartAppSDK */
public class C5297b {

    /* renamed from: a */
    private static volatile boolean f17032a = false;

    /* renamed from: com.startapp.android.publish.adsCommon.Utils.b$a */
    /* compiled from: StartAppSDK */
    public static final class C5299a implements C5532a {
        public C5533b create(int i) {
            if (i == 586482792) {
                return new C5484f();
            }
            if (i != 786564404) {
                return null;
            }
            return new C5482e();
        }
    }

    /* renamed from: a */
    public static void m22615a(Context context) {
        if (!f17032a) {
            f17032a = true;
            C5527a.m23604a((C5536c) new C5536c() {
                /* renamed from: a */
                public void mo19618a(int i, String str, String str2, Throwable th) {
                    C5518g.m23564a(str, i, str2, th);
                }
            });
            C5527a.m23595a(context);
            C5527a.m23603a((C5532a) new C5299a());
        }
    }

    /* renamed from: a */
    public static long m22613a() {
        return SystemClock.elapsedRealtime() + (((long) MetaData.getInstance().getPeriodicMetaDataInterval()) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    /* renamed from: b */
    public static long m22619b(Context context) {
        return SystemClock.elapsedRealtime() + (((long) MetaData.getInstance().getPeriodicInfoEventIntervalInMinutes(context)) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    }

    /* renamed from: c */
    public static void m22620c(Context context) {
        m22618a(context, Long.valueOf(m22619b(context)));
    }

    /* renamed from: a */
    public static void m22618a(Context context, Long l) {
        StringBuilder sb = new StringBuilder();
        sb.append("setMetaDataPeriodicAlarm executes ");
        sb.append(l);
        C5518g.m23563a("StartAppWall.DataUtils", 3, sb.toString());
        if (!C5414k.m23092a(context, "periodicMetadataPaused", Boolean.valueOf(false)).booleanValue() && MetaData.getInstance().isPeriodicMetaDataEnabled()) {
            m22616a(context, 586482792, l.longValue() - SystemClock.elapsedRealtime(), "periodicMetadataTriggerTime");
        }
    }

    /* renamed from: d */
    public static void m22621d(Context context) {
        m22617a(context, m22619b(context));
    }

    /* renamed from: a */
    public static void m22617a(Context context, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("setInfoEventPeriodicAlarm executes ");
        sb.append(j);
        C5518g.m23563a("StartAppWall.DataUtils", 3, sb.toString());
        if (!C5414k.m23092a(context, "periodicInfoEventPaused", Boolean.valueOf(false)).booleanValue() && MetaData.getInstance().isPeriodicInfoEventEnabled()) {
            m22616a(context, 786564404, j - SystemClock.elapsedRealtime(), "periodicInfoEventTriggerTime");
        }
    }

    /* renamed from: a */
    public static void m22614a(int i) {
        C5527a.m23601a(i, false);
    }

    /* renamed from: a */
    private static void m22616a(Context context, int i, long j, String str) {
        if (C5527a.m23608a(new C5539a(i).mo20518a(j).mo20522a())) {
            C5414k.m23102b(context, str, Long.valueOf(j + SystemClock.elapsedRealtime()));
            return;
        }
        C5376d dVar = C5376d.EXCEPTION;
        StringBuilder sb = new StringBuilder();
        sb.append("Util.setPeriodicAlarm - failed setting alarm ");
        sb.append(i);
        C5378f.m23016a(context, dVar, sb.toString(), "", "");
    }
}
