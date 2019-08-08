package com.startapp.android.publish.adsCommon.p178b;

import android.content.Context;
import com.startapp.android.publish.adsCommon.C5349c;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.adsCommon.p182f.C5376d;
import com.startapp.android.publish.adsCommon.p182f.C5378f;
import com.startapp.common.C5554g;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5518g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.android.publish.adsCommon.b.b */
/* compiled from: StartAppSDK */
public class C5346b {

    /* renamed from: a */
    private List<C5345a> f17143a;

    /* renamed from: b */
    private Context f17144b;

    /* renamed from: c */
    private List<String> f17145c = new ArrayList();

    public C5346b(Context context, List<C5345a> list) {
        this.f17143a = list;
        this.f17144b = context;
    }

    /* renamed from: a */
    public void mo19799a() {
        C5554g.m23702a(C5558a.DEFAULT, (Runnable) new Runnable() {
            public void run() {
                C5346b.this.mo19800b();
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Boolean mo19800b() {
        boolean z;
        C5518g.m23561a(3, "in doInBackground handler");
        try {
            m22837c();
            z = true;
        } catch (Exception e) {
            C5378f.m23016a(this.f17144b, C5376d.EXCEPTION, "AppPresenceHandler.doInBackground - sendAdImpressions failed", e.getMessage(), "");
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    private void m22837c() {
        m22836a(this.f17143a, this.f17145c);
        for (int i = 0; i < this.f17145c.size(); i++) {
            String str = (String) this.f17145c.get(i);
            if (str.length() != 0) {
                C5349c.m22853a(this.f17144b, str, new C5363b().setNonImpressionReason("APP_PRESENCE"));
            }
        }
    }

    /* renamed from: a */
    private void m22836a(List<C5345a> list, List<String> list2) {
        C5518g.m23561a(3, "in getAppPresenceDParameter()");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C5345a aVar : list) {
            if (!aVar.mo19796c()) {
                String a = m22835a(aVar.mo19791a());
                if (aVar.mo19797d()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("d=");
                    sb.append(a);
                    arrayList.add(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("d=");
                    sb2.append(a);
                    arrayList2.add(sb2.toString());
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("appPresence tracking size = ");
        sb3.append(arrayList.size());
        sb3.append(" normal size = ");
        sb3.append(arrayList2.size());
        C5518g.m23561a(3, sb3.toString());
        if (!arrayList.isEmpty()) {
            list2.addAll(C5349c.m22850a((List<String>) arrayList, "false", "true"));
        }
        if (!arrayList2.isEmpty()) {
            list2.addAll(C5349c.m22850a((List<String>) arrayList2, "false", "false"));
        }
    }

    /* renamed from: a */
    private String m22835a(String str) {
        return str.split("tracking/adImpression[?]d=")[1];
    }
}
