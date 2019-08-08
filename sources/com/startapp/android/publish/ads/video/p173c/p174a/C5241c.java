package com.startapp.android.publish.ads.video.p173c.p174a;

import android.content.Context;
import android.util.DisplayMetrics;
import com.startapp.android.publish.ads.video.p173c.p174a.p175a.C5236b;
import com.startapp.common.p193a.C5519h;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.startapp.android.publish.ads.video.c.a.c */
/* compiled from: StartAppSDK */
public class C5241c {

    /* renamed from: a */
    protected int f16870a;

    /* renamed from: b */
    protected int f16871b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f16872c;

    /* renamed from: com.startapp.android.publish.ads.video.c.a.c$a */
    /* compiled from: StartAppSDK */
    private class C5243a implements Comparator<C5236b> {
        private C5243a() {
        }

        /* renamed from: a */
        public int compare(C5236b bVar, C5236b bVar2) {
            int intValue = bVar.mo19321d().intValue() * bVar.mo19323e().intValue();
            int intValue2 = bVar2.mo19321d().intValue() * bVar2.mo19323e().intValue();
            int abs = Math.abs(intValue - C5241c.this.f16872c);
            int abs2 = Math.abs(intValue2 - C5241c.this.f16872c);
            if (abs < abs2) {
                return -1;
            }
            return abs > abs2 ? 1 : 0;
        }
    }

    public C5241c(Context context) {
        m22432a(context);
    }

    /* renamed from: a */
    public C5236b mo19337a(List<C5236b> list) {
        if (list == null || mo19340c(list) == 0) {
            return null;
        }
        Collections.sort(list, mo19338a());
        return mo19339b(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Comparator<C5236b> mo19338a() {
        return new C5243a();
    }

    /* renamed from: a */
    private void m22432a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f16870a = displayMetrics.widthPixels;
        this.f16871b = displayMetrics.heightPixels;
        this.f16872c = this.f16870a * this.f16871b;
        if (!C5519h.m23568a(context).equals("WIFI")) {
            this.f16872c = (int) (0.75f * ((float) this.f16872c));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5236b mo19339b(List<C5236b> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (C5236b) list.get(0);
    }

    /* renamed from: a */
    private boolean m22433a(C5236b bVar) {
        return bVar.mo19314b().matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo19340c(List<C5236b> list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5236b bVar = (C5236b) it.next();
            if (!bVar.mo19325f() || !m22433a(bVar)) {
                it.remove();
            }
        }
        return list.size();
    }
}
