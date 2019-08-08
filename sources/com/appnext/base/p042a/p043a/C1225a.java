package com.appnext.base.p042a.p043a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.appnext.base.p042a.C1228b;
import com.appnext.base.p046b.C1247e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.appnext.base.a.a.a */
public class C1225a {

    /* renamed from: gp */
    private static C1225a f3886gp;

    /* renamed from: gq */
    private static C1228b f3887gq;

    /* renamed from: go */
    private AtomicInteger f3888go = new AtomicInteger(0);

    /* renamed from: gr */
    private SQLiteDatabase f3889gr;

    /* renamed from: com.appnext.base.a.a.a$1 */
    static /* synthetic */ class C12261 {

        /* renamed from: gs */
        static final /* synthetic */ int[] f3890gs = new int[C1227a.m5171aW().length];

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        static {
            /*
                int[] r0 = com.appnext.base.p042a.p043a.C1225a.C1227a.m5171aW()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3890gs = r0
                r0 = 1
                int[] r1 = f3890gs     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = com.appnext.base.p042a.p043a.C1225a.C1227a.DatabaseOrDiskFull$53629b42     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2 - r0
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = f3890gs     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = com.appnext.base.p042a.p043a.C1225a.C1227a.Global$53629b42     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r2 = r2 - r0
                r0 = 2
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.base.p042a.p043a.C1225a.C12261.<clinit>():void");
        }
    }

    /* renamed from: com.appnext.base.a.a.a$a */
    public enum C1227a {
        ;
        
        public static final int DatabaseOrDiskFull$53629b42 = 2;
        public static final int Global$53629b42 = 1;

        static {
            $VALUES$40a167d9 = new int[]{Global$53629b42, DatabaseOrDiskFull$53629b42};
        }

        /* renamed from: aW */
        public static int[] m5171aW() {
            return (int[]) $VALUES$40a167d9.clone();
        }
    }

    private C1225a(Context context) {
        f3887gq = C1228b.m5172f(context);
    }

    /* renamed from: aT */
    public static C1225a m5168aT() {
        if (f3886gp == null) {
            synchronized (C1225a.class) {
                if (f3886gp == null) {
                    f3886gp = new C1225a(C1247e.getContext().getApplicationContext());
                }
            }
        }
        return f3886gp;
    }

    /* renamed from: aU */
    public final SQLiteDatabase mo5890aU() {
        if (this.f3888go.incrementAndGet() == 1) {
            this.f3889gr = f3887gq.getWritableDatabase();
        }
        return this.f3889gr;
    }

    /* renamed from: aV */
    public final void mo5891aV() {
        if (this.f3888go.decrementAndGet() == 0) {
            this.f3889gr.close();
        }
    }

    /* renamed from: a */
    public static void m5167a(int i, Throwable th) {
        int[] iArr = C12261.f3890gs;
    }
}
