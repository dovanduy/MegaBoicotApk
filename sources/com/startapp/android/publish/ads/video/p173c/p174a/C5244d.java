package com.startapp.android.publish.ads.video.p173c.p174a;

import android.content.Context;
import com.startapp.android.publish.ads.video.p173c.p174a.p175a.C5236b;
import java.util.Comparator;

/* renamed from: com.startapp.android.publish.ads.video.c.a.d */
/* compiled from: StartAppSDK */
public class C5244d extends C5241c {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final double f16874c = (((double) this.f16870a) / ((double) this.f16871b));
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f16875d = (this.f16870a * this.f16871b);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f16876e;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m22443b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public C5244d(Context context, int i) {
        super(context);
        this.f16876e = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Comparator<C5236b> mo19338a() {
        return new Comparator<C5236b>() {
            /* renamed from: a */
            public int compare(C5236b bVar, C5236b bVar2) {
                double doubleValue = C5244d.this.m22441a(bVar.mo19321d().intValue(), bVar.mo19323e().intValue(), C5244d.this.f16874c, C5244d.this.f16875d).doubleValue();
                double doubleValue2 = C5244d.this.m22441a(bVar2.mo19321d().intValue(), bVar2.mo19323e().intValue(), C5244d.this.f16874c, C5244d.this.f16875d).doubleValue();
                if (doubleValue < doubleValue2) {
                    return -1;
                }
                if (doubleValue > doubleValue2) {
                    return 1;
                }
                Integer c = bVar.mo19318c();
                Integer c2 = bVar2.mo19318c();
                if (c == null && c2 == null) {
                    return 0;
                }
                if (c == null) {
                    return 1;
                }
                if (c2 == null) {
                    return -1;
                }
                return C5244d.m22443b(Integer.valueOf(Math.abs(C5244d.this.f16876e - c.intValue())).intValue(), Integer.valueOf(Math.abs(C5244d.this.f16876e - c2.intValue())).intValue());
            }
        };
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Double m22441a(int i, int i2, double d, int i3) {
        return Double.valueOf((40.0d * Math.abs(Math.log((((double) i) / ((double) i2)) / d))) + (60.0d * Math.abs(Math.log(((double) (i * i2)) / ((double) i3)))));
    }
}
