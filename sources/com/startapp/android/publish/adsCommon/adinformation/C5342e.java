package com.startapp.android.publish.adsCommon.adinformation;

import android.content.Context;
import android.graphics.Bitmap;
import com.startapp.android.publish.adsCommon.Utils.C5295a;
import com.startapp.android.publish.adsCommon.Utils.C5307i;
import com.startapp.common.C5499a;
import com.startapp.common.C5499a.C5502a;
import java.io.Serializable;

/* renamed from: com.startapp.android.publish.adsCommon.adinformation.e */
/* compiled from: StartAppSDK */
public class C5342e implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private transient Bitmap f17131a;

    /* renamed from: b */
    private transient Bitmap f17132b;

    /* renamed from: c */
    private transient Bitmap f17133c = null;
    private int height = 1;
    private String imageFallbackUrl = "";
    private String imageUrlSecured = "";
    private String name;
    private int width = 1;

    private C5342e() {
    }

    /* renamed from: a */
    public String mo19734a() {
        return this.name;
    }

    /* renamed from: a */
    public Bitmap mo19733a(Context context) {
        if (this.f17133c == null) {
            this.f17133c = mo19746f();
            if (this.f17133c == null) {
                this.f17133c = mo19739b(context);
            }
        }
        return this.f17133c;
    }

    /* renamed from: b */
    public int mo19738b() {
        return this.width;
    }

    /* renamed from: c */
    public int mo19742c() {
        return this.height;
    }

    /* renamed from: a */
    public void mo19735a(int i) {
        this.width = i;
    }

    /* renamed from: b */
    public void mo19740b(int i) {
        this.height = i;
    }

    /* renamed from: d */
    public String mo19743d() {
        return this.imageUrlSecured != null ? this.imageUrlSecured : "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo19744e() {
        mo19736a((Bitmap) null);
        new C5499a(mo19743d(), new C5502a() {
            /* renamed from: a */
            public void mo18881a(Bitmap bitmap, int i) {
                C5342e.this.mo19736a(bitmap);
            }
        }, 0).mo20469a();
    }

    /* renamed from: a */
    public void mo19737a(String str) {
        this.imageFallbackUrl = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo19741b(String str) {
        this.name = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19736a(Bitmap bitmap) {
        this.f17131a = bitmap;
        if (bitmap != null) {
            this.f17133c = bitmap;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public Bitmap mo19746f() {
        return this.f17131a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public String mo19747g() {
        return this.imageFallbackUrl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Bitmap mo19739b(Context context) {
        if (this.f17132b == null) {
            this.f17132b = C5295a.m22608a(context, mo19747g());
        }
        return this.f17132b;
    }

    /* renamed from: c */
    public static C5342e m22766c(String str) {
        C5342e eVar = new C5342e();
        eVar.mo19741b(str);
        return eVar;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5342e eVar = (C5342e) obj;
        if (this.width != eVar.width || this.height != eVar.height || !C5307i.m22682b(this.imageUrlSecured, eVar.imageUrlSecured) || !C5307i.m22682b(this.imageFallbackUrl, eVar.imageFallbackUrl) || !C5307i.m22682b(this.name, eVar.name)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C5307i.m22652a(this.imageUrlSecured, this.imageFallbackUrl, Integer.valueOf(this.width), Integer.valueOf(this.height), this.name);
    }
}
