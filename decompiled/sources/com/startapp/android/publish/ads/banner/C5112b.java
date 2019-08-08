package com.startapp.android.publish.ads.banner;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.startapp.android.publish.ads.banner.b */
/* compiled from: StartAppSDK */
class C5112b {

    /* renamed from: a */
    private Context f16485a;

    /* renamed from: b */
    private String f16486b;

    C5112b(Context context, AttributeSet attributeSet) {
        this.f16485a = context;
        this.f16486b = m22033a(attributeSet, "adTag");
    }

    /* renamed from: a */
    private String m22033a(AttributeSet attributeSet, String str) {
        String str2;
        try {
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, str, -1);
            if (attributeResourceValue != -1) {
                str2 = this.f16485a.getResources().getString(attributeResourceValue);
            } else {
                str2 = attributeSet.getAttributeValue(null, str);
            }
            return str2;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String mo18850a() {
        return this.f16486b;
    }
}
