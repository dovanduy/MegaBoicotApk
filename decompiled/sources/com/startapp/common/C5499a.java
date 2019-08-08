package com.startapp.common;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.startapp.common.C5554g.C5558a;
import com.startapp.common.p193a.C5513d;

/* renamed from: com.startapp.common.a */
/* compiled from: StartAppSDK */
public class C5499a {

    /* renamed from: a */
    String f17537a;

    /* renamed from: b */
    C5502a f17538b;

    /* renamed from: c */
    int f17539c;

    /* renamed from: com.startapp.common.a$a */
    /* compiled from: StartAppSDK */
    public interface C5502a {
        /* renamed from: a */
        void mo18881a(Bitmap bitmap, int i);
    }

    public C5499a(String str, C5502a aVar, int i) {
        this.f17537a = str;
        this.f17538b = aVar;
        this.f17539c = i;
    }

    /* renamed from: a */
    public void mo20469a() {
        C5554g.m23702a(C5558a.HIGH, (Runnable) new Runnable() {
            public void run() {
                final Bitmap b = C5513d.m23541b(C5499a.this.f17537a);
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        if (C5499a.this.f17538b != null) {
                            C5499a.this.f17538b.mo18881a(b, C5499a.this.f17539c);
                        }
                    }
                });
            }
        });
    }
}
