package com.startapp.android.publish.adsCommon.p183g.p186c;

import com.appnext.core.C1286Ad;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.startapp.android.publish.adsCommon.g.c.a */
/* compiled from: StartAppSDK */
public final class C5391a {

    /* renamed from: c */
    private static final List<String> f17257c = Arrays.asList(new String[]{C1286Ad.ORIENTATION_PORTRAIT, C1286Ad.ORIENTATION_LANDSCAPE, "none"});

    /* renamed from: a */
    public boolean f17258a;

    /* renamed from: b */
    public int f17259b;

    public C5391a() {
        this(true, 2);
    }

    public C5391a(boolean z, int i) {
        this.f17258a = z;
        this.f17259b = i;
    }

    /* renamed from: a */
    public static int m23044a(String str) {
        int indexOf = f17257c.indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }
}
