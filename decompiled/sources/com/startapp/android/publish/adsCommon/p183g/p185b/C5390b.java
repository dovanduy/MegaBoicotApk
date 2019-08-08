package com.startapp.android.publish.adsCommon.p183g.p185b;

import android.content.Context;
import android.os.Build.VERSION;
import com.startapp.common.p193a.C5509c;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.android.publish.adsCommon.g.b.b */
/* compiled from: StartAppSDK */
public class C5390b {

    /* renamed from: a */
    private Context f17255a;

    /* renamed from: b */
    private List<String> f17256b = new ArrayList();

    public C5390b(Context context) {
        this.f17255a = context.getApplicationContext();
    }

    /* renamed from: a */
    public boolean mo19932a() {
        boolean z = this.f17256b.contains("calendar") && VERSION.SDK_INT >= 14 && C5509c.m23516a(this.f17255a, "android.permission.WRITE_CALENDAR");
        StringBuilder sb = new StringBuilder();
        sb.append("isCalendarSupported ");
        sb.append(z);
        C5518g.m23563a("MraidNativeFeatureManager", 3, sb.toString());
        return z;
    }

    /* renamed from: b */
    public boolean mo19934b() {
        boolean contains = this.f17256b.contains("inlineVideo");
        StringBuilder sb = new StringBuilder();
        sb.append("isInlineVideoSupported ");
        sb.append(contains);
        C5518g.m23563a("MraidNativeFeatureManager", 3, sb.toString());
        return contains;
    }

    /* renamed from: c */
    public boolean mo19935c() {
        boolean z = this.f17256b.contains("sms") && C5509c.m23516a(this.f17255a, "android.permission.SEND_SMS");
        StringBuilder sb = new StringBuilder();
        sb.append("isSmsSupported ");
        sb.append(z);
        C5518g.m23563a("MraidNativeFeatureManager", 3, sb.toString());
        return z;
    }

    /* renamed from: d */
    public boolean mo19936d() {
        boolean contains = this.f17256b.contains("storePicture");
        StringBuilder sb = new StringBuilder();
        sb.append("isStorePictureSupported ");
        sb.append(contains);
        C5518g.m23563a("MraidNativeFeatureManager", 3, sb.toString());
        return contains;
    }

    /* renamed from: e */
    public boolean mo19937e() {
        boolean z = this.f17256b.contains("tel") && C5509c.m23516a(this.f17255a, "android.permission.CALL_PHONE");
        StringBuilder sb = new StringBuilder();
        sb.append("isTelSupported ");
        sb.append(z);
        C5518g.m23563a("MraidNativeFeatureManager", 3, sb.toString());
        return z;
    }

    /* renamed from: f */
    public List<String> mo19938f() {
        return this.f17256b;
    }

    /* renamed from: a */
    public boolean mo19933a(String str) {
        return mo19938f().contains(str);
    }
}
