package com.startapp.android.publish.ads.list3d;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.p180d.C5363b;
import com.startapp.android.publish.common.model.AdDetails;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.android.publish.ads.list3d.e */
/* compiled from: StartAppSDK */
public class C5168e {

    /* renamed from: a */
    private C5157a f16640a = new C5157a();

    /* renamed from: b */
    private List<ListItem> f16641b;

    /* renamed from: c */
    private String f16642c = "";

    /* renamed from: a */
    public void mo19068a() {
        this.f16641b = new ArrayList();
        this.f16642c = "";
    }

    /* renamed from: a */
    public void mo19071a(AdDetails adDetails) {
        ListItem listItem = new ListItem(adDetails);
        this.f16641b.add(listItem);
        this.f16640a.mo19018a(this.f16641b.size() - 1, listItem.mo18989a(), listItem.mo18998i());
    }

    /* renamed from: b */
    public void mo19073b() {
        this.f16640a.mo19023b();
    }

    /* renamed from: c */
    public void mo19075c() {
        this.f16640a.mo19024c();
    }

    /* renamed from: d */
    public void mo19076d() {
        this.f16640a.mo19025d();
    }

    /* renamed from: e */
    public List<ListItem> mo19077e() {
        return this.f16641b;
    }

    /* renamed from: a */
    public Bitmap mo19067a(int i, String str, String str2) {
        return this.f16640a.mo19018a(i, str, str2);
    }

    /* renamed from: a */
    public void mo19069a(Context context, String str, String str2, C5363b bVar, long j) {
        C5157a aVar = this.f16640a;
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(this.f16642c);
        aVar.mo19020a(context, str, sb.toString(), bVar, j);
    }

    /* renamed from: a */
    public void mo19072a(String str) {
        C5157a aVar = this.f16640a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.f16642c);
        aVar.mo19022a(sb.toString());
    }

    /* renamed from: a */
    public void mo19070a(C5170g gVar, boolean z) {
        this.f16640a.mo19021a(gVar, z);
    }

    /* renamed from: b */
    public void mo19074b(String str) {
        this.f16642c = str;
    }
}
