package com.facebook.ads.internal.p092s;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.s.h */
public class C1808h {

    /* renamed from: a */
    private boolean f5722a;

    /* renamed from: b */
    private int f5723b;

    /* renamed from: c */
    private int f5724c;

    /* renamed from: d */
    private int f5725d;

    /* renamed from: e */
    private int f5726e;

    /* renamed from: f */
    private int f5727f;

    /* renamed from: a */
    public Map<String, String> mo7709a() {
        HashMap hashMap = new HashMap();
        hashMap.put("is_timeout", Boolean.toString(this.f5722a));
        hashMap.put("ad_count", Integer.toString(this.f5723b));
        hashMap.put("default_ad_index", Integer.toString(this.f5724c));
        hashMap.put("selected_ad_index", Integer.toString(this.f5725d));
        hashMap.put("elapsed_time_from_timer_ms", Integer.toString(this.f5726e));
        hashMap.put("countdown_time_ms", Integer.toString(this.f5727f));
        return hashMap;
    }

    /* renamed from: a */
    public void mo7710a(int i) {
        this.f5723b = i;
    }

    /* renamed from: a */
    public void mo7711a(boolean z) {
        this.f5722a = z;
    }

    /* renamed from: b */
    public void mo7712b(int i) {
        this.f5724c = i;
    }

    /* renamed from: c */
    public void mo7713c(int i) {
        this.f5725d = i;
    }

    /* renamed from: d */
    public void mo7714d(int i) {
        this.f5726e = i;
    }

    /* renamed from: e */
    public void mo7715e(int i) {
        this.f5727f = i;
    }
}
