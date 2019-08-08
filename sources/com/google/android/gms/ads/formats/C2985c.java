package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.C3987mk;
import com.google.android.gms.internal.ads.aur;
import com.google.android.gms.p137b.C3235a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.formats.c */
public final class C2985c {

    /* renamed from: a */
    public static WeakHashMap<View, C2985c> f8723a = new WeakHashMap<>();

    /* renamed from: b */
    private aur f8724b;

    /* renamed from: c */
    private WeakReference<View> f8725c;

    /* renamed from: a */
    private final void m10679a(C3235a aVar) {
        View view = this.f8725c != null ? (View) this.f8725c.get() : null;
        if (view == null) {
            C3987mk.m17435e("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f8723a.containsKey(view)) {
            f8723a.put(view, this);
        }
        if (this.f8724b != null) {
            try {
                this.f8724b.mo14877a(aVar);
            } catch (RemoteException e) {
                C3987mk.m17430b("Unable to call setNativeAd on delegate", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo12340a(C2980a aVar) {
        m10679a((C3235a) aVar.mo12325a());
    }

    /* renamed from: a */
    public final void mo12341a(C2993g gVar) {
        m10679a((C3235a) gVar.mo12369k());
    }
}
