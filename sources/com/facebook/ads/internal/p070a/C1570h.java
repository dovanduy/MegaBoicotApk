package com.facebook.ads.internal.p070a;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.internal.p092s.C1802c;
import com.facebook.ads.internal.p115w.p117b.C2308c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.a.h */
public abstract class C1570h extends C1563b {

    /* renamed from: d */
    protected final C1575m f4823d;

    public C1570h(Context context, C1802c cVar, String str, C1575m mVar) {
        super(context, cVar, str);
        this.f4823d = mVar;
    }

    /* renamed from: a */
    public final void mo7058a() {
        if (this.f4823d != null) {
            this.f4823d.mo7074a(this.f4807c);
        }
        mo7065e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7069a(Map<String, String> map, C1562a aVar) {
        if (!TextUtils.isEmpty(this.f4807c)) {
            if (this instanceof C1568f) {
                this.f4806b.mo7695h(this.f4807c, map);
            } else {
                this.f4806b.mo7690c(this.f4807c, map);
            }
            boolean a = C1562a.m6490a(aVar);
            if (this.f4823d != null) {
                this.f4823d.mo7073a(aVar);
                if (a) {
                    this.f4823d.mo7072a();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("leave_time", Long.toString(-1));
                hashMap.put("back_time", Long.toString(-1));
                hashMap.put("outcome", C1562a.CANNOT_TRACK.name());
                this.f4806b.mo7700m(this.f4807c, hashMap);
            }
        }
        C2308c.m9020a(this.f4805a, "Click logged");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public abstract void mo7065e();
}
